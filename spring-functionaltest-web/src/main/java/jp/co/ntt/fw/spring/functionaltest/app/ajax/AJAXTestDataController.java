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
package jp.co.ntt.fw.spring.functionaltest.app.ajax;

import javax.inject.Inject;

import jp.co.ntt.fw.spring.functionaltest.domain.service.ajax.MessageBoardService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "ajax/testdata")
@Controller
public class AJAXTestDataController {

    @Inject
    MessageBoardService messageBoardService;

    @RequestMapping(value = "messageBoards", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Void> delete() {
        messageBoardService.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
