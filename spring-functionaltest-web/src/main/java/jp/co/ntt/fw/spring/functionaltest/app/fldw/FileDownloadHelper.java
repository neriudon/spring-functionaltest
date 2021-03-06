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
package jp.co.ntt.fw.spring.functionaltest.app.fldw;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class FileDownloadHelper {

    public void bindToModel(Model model,
            ContentDownloadForm form) throws UnsupportedEncodingException, IOException {
        model.addAttribute("name", form.getName());
        model.addAttribute("birthdate", form.getBirthdate());
        model.addAttribute("address", form.getAddress());
    }

    public JRDataSource getData(ContentDownloadForm form) {
        // Create an array list of Sales
        List<ContentDownloadResult> items = new ArrayList<ContentDownloadResult>();
        ContentDownloadResult item1 = new ContentDownloadResult();
        item1.setName(form.getName());
        item1.setBirthdate(form.getBirthdate());
        item1.setAddress(form.getAddress());

        items.add(item1);

        JRBeanCollectionDataSource jrDataSource = new JRBeanCollectionDataSource(items);
        return jrDataSource;
    }
}
