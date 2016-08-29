

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescriptions", propOrder = {
    "template"
})
public class UriTemplateDescriptions  {

    @XmlElement(name = "Template")
    protected List<UriTemplateDescription> template;

    public List<UriTemplateDescription> getTemplate() {
        if (template == null) {
            template = new ArrayList<UriTemplateDescription>();
        }
        return this.template;
    }



}
