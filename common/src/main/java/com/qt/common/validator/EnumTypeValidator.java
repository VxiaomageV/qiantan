/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qt.common.validator;

import com.qt.common.enums.BaseEnum;
import com.qt.common.exception.BusinessException;
import com.qt.common.utils.EnumUtil;
import com.qt.common.validator.constraints.EnumType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义系统内的枚举验证注解实现类
 *
 * @author geekidea
 * @date 2018-11-08
 */
public class EnumTypeValidator implements ConstraintValidator<EnumType, Integer> {

    private Class<? extends BaseEnum> baseEnum;

    @Override
    public void initialize(EnumType parameters) {
        baseEnum = parameters.type();
        if (baseEnum == null) {
            throw new BusinessException("请传入枚举类型类");
        }
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        }
        return EnumUtil.exists(baseEnum, value);
    }
}
