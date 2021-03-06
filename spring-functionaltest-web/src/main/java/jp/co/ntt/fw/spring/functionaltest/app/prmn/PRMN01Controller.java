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
package jp.co.ntt.fw.spring.functionaltest.app.prmn;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("prmn")
@Controller
public class PRMN01Controller {

    @Inject
    PrmnDefines prmnDefines;

    @RequestMapping(value = "0101/001")
    public String handle0101001(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/ownProjectPropertiesDsp";
    }

    @RequestMapping(value = "0101/002")
    public String handle0101002(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/otherProjectPropertiesDsp";
    }

    @RequestMapping(value = "0102/001")
    public String handle0102001(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/orderJvmEnvValDsp";
    }

    @RequestMapping(value = "0102/002")
    public String handle0102002(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/orderAppEnvValDsp";
    }

    @RequestMapping(value = "0102/003")
    public String handle0102003(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/orderOrderEnvValDsp";
    }

    @RequestMapping(value = "0103/001")
    public String handle0103001(Model model) {
        model.addAttribute("prmnDefines", prmnDefines);
        return "prmn/orderOsEnvValThanAppDsp";
    }

}
