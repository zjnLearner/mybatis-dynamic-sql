/**
 *    Copyright 2016-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package examples.simple;

import java.util.List;

import org.mybatis.dynamic.sql.delete.render.DeleteStatement;
import org.mybatis.dynamic.sql.insert.render.InsertStatement;
import org.mybatis.dynamic.sql.select.render.SelectStatement;
import org.mybatis.dynamic.sql.update.render.UpdateStatement;

public interface SimpleTableXmlMapper {
    List<SimpleTableRecord> selectMany(SelectStatement selectStatement);
    int delete(DeleteStatement deleteStatement);
    int insert(InsertStatement<SimpleTableRecord> insertStatement);
    int update(UpdateStatement updateStatement);
    SimpleTableRecord selectOne(SelectStatement selectStatement);
    long count(SelectStatement selectStatement);
}
