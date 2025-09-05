package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader reader;
    ProfileService service;
    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }
    @Override
    public int importFrom(Path csvFile) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'importFrom'");
        List<String[]> rows = reader.read(csvFile);
        int count = 0;
        for(String []row : rows){
            if(row.length < 3) continue;
            String id = row[0];
            String email = row[1];
            String displayName = row[2];
            if(!isValidEmail(email) || id.isEmpty() || email.isEmpty()) continue;
            service.createProfile(id, email, displayName);
            count++;

        }
        return count;
    }
    private boolean isValidEmail(String email) {
        return email.contains("@"); 
    }
    
}
