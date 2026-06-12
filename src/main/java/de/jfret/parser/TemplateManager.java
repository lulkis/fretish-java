package de.jfret.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.Map;

public class TemplateManager {

    private Map<String, Map<String, Object>> templates;

    public TemplateManager() {
        loadTemplates();
    }

    private void loadTemplates() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getClassLoader().getResourceAsStream("semantics.json");
            if (is == null) {
                throw new RuntimeException("templates.json nicht im Resources-Ordner gefunden!");
            }

            this.templates = mapper.readValue(is, new TypeReference<Map<String, Map<String, Object>>>() {});
            System.out.println("Erfolgreich " + templates.size() + " Templates geladen.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPastTimeTemplate(String lookupKey) {
        if (templates != null && templates.containsKey(lookupKey)) {
            Map<String, Object> templateData = templates.get(lookupKey);
            return (String) templateData.get("pt");
        }
        return null;
    }
}
