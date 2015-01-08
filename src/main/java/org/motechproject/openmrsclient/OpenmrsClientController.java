package org.motechproject.openmrsclient;

import org.motechproject.openmrs19.service.OpenMRSPatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

@Controller
public class OpenmrsClientController {

    private static final Logger LOG = LoggerFactory.getLogger(OpenmrsClientController.class);

    private static final String OK = "OK";

    @Autowired
    private OpenMRSPatientService patientService;

    @PostConstruct
    public void init() {
        LOG.info("Initialized");
    }

    @RequestMapping("/status")
    @ResponseBody
    public String status() {
        return OK;
    }
}
