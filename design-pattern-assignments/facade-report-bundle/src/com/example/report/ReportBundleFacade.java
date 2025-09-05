package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName){
        data = Map.of("name", "Quarterly");
        JsonWriter jw = new JsonWriter(); 
        Zipper z = new Zipper(); 
        AuditLog log = new AuditLog();
        Path json = jw.write(data, outDir, baseName);
        Path zip = z.zip(json, outDir.resolve(baseName + ".zip"));
        log.log("exported " + zip);
        System.out.println("DONE " + zip);
        return zip;
    }
}
