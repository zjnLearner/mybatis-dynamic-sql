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
package examples.generated.always;

import java.util.List;

import org.mybatis.dynamic.sql.insert.render.InsertSupport;
import org.mybatis.dynamic.sql.select.SelectSupport;
import org.mybatis.dynamic.sql.update.render.UpdateSupport;

public interface GeneratedAlwaysXmlMapper {
    List<GeneratedAlwaysRecord> selectByExample(SelectSupport selectSupport);
    GeneratedAlwaysRecord selectByPrimaryKey(int id);
    int insert(InsertSupport<GeneratedAlwaysRecord> insertSupport);
    int update(UpdateSupport updateSupport);
}
