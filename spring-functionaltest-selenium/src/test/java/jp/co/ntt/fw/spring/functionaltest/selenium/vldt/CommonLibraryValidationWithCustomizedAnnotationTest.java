/*
 * Copyright 2014-2018 NTT Corporation.
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
package jp.co.ntt.fw.spring.functionaltest.selenium.vldt;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.By.id;

import org.junit.Test;
import org.openqa.selenium.By;

import jp.co.ntt.fw.spring.functionaltest.selenium.FunctionTestSupport;

public class CommonLibraryValidationWithCustomizedAnnotationTest extends
                                                                 FunctionTestSupport {

    private void clickLink(By by) {
        webDriverOperations.click(by);
    }

    /**
     * VLDT0503001
     * <ul>
     * <li>拡張アノテーションを利用し、コレクションに対して入力チェックが行えることを確認する。</li>
     * </ul>
     */
    @Test
    public void testVLDT0503001() {
        String testId = "vldt0503001";
        String target = "roles";
        String errors = "errors";
        String validate = "validate";
        String errorMessage1 = "\"roles[0]\" must exist in code list of CL_ROLE.";
        String errorMessage2 = "\"roles[1]\" must exist in code list of CL_ROLE.";

        // テスト画面表示
        {
            clickLink(id(testId));
        }
        // 実施条件1
        {
            // checkbox押下
            {
                webDriverOperations.click(id(target + "1"));
                webDriverOperations.click(id(target + "2"));
                webDriverOperations.click(id(validate));
            }

            // 結果確認
            {
                assertThat(webDriverOperations.exists(id(target + "*."
                        + errors)), is(false));
            }
        }

        // 実施条件2
        {
            // checkbox内の値の書き換え
            {
                webDriverOperations.overrideText(id(target + "1"), "3");
                webDriverOperations.overrideText(id(target + "2"), "4");
                webDriverOperations.click(id(validate));
            }

            // 結果確認
            {
                assertThat(webDriverOperations.getText(id(target + "*."
                        + errors)), containsString(errorMessage1));
                assertThat(webDriverOperations.getText(id(target + "*."
                        + errors)), containsString(errorMessage2));
            }
        }
    }
}
