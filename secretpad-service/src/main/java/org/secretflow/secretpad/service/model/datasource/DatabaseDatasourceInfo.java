/*
 * Copyright 2024 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.service.model.datasource;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yye
 * @date 2024/10/14
 */
@Getter
@Setter
public class DatabaseDatasourceInfo extends DataSourceInfo {

    @NotBlank(message = "dbtype cannot be empty")
    private String database;

    @NotBlank
    private String endpoint;

    @NotBlank(message = "user cannot be empty")
    private String user;

    @NotBlank(message = "password cannot be empty")
    private String password;

    public static DatabaseDatasourceInfo create(String dbtype,String endpoint, String user, String password) {
        DatabaseDatasourceInfo DbDatasourceInfo = new DatabaseDatasourceInfo();
        DbDatasourceInfo.setDatabase(dbtype);
        DbDatasourceInfo.setEndpoint(endpoint);
        DbDatasourceInfo.setUser(user);
        DbDatasourceInfo.setPassword(password);
        return DbDatasourceInfo;
    }
}
