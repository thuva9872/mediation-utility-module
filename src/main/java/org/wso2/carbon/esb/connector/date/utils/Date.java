/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.carbon.esb.connector.date.utils;

import org.wso2.carbon.esb.connector.date.utils.exception.IllegalDateFormatException;

import java.text.Format;
import java.text.SimpleDateFormat;

public class Date {

    private Date() {

    }

    /**
     * @param dateFormat String.
     * @return currentDate String.
     */
    public static String getDate(String dateFormat) throws IllegalDateFormatException {

        Format formatter;
        try {
            formatter = new SimpleDateFormat(dateFormat);
        } catch (IllegalArgumentException e) {
            throw new IllegalDateFormatException(e);
        }
        return formatter.format(new java.util.Date());
    }
}
