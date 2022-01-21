package com.pettyfox.utils;

import cn.hutool.core.bean.BeanUtil;
import com.pettyfox.commons.exception.DirtyException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Petty Fox
 */
public class CommAssembler {

    public static <PO, VO> List<VO> convert(List<PO> list, Class<VO> voClazz) {
        return list.stream().map(po -> {
            try {
                VO vo = voClazz.newInstance();
                BeanUtil.copyProperties(po, vo);
                return vo;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }

    public static <ED, PO> PO convert(ED edit, Class<PO> poClass) {
        try {
            PO po = poClass.newInstance();
            BeanUtil.copyProperties(edit, po);
            return po;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new DirtyException("assembler failed");
    }

}
