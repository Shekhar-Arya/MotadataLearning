package com.company;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient patient, Patient t1) {
        if(patient.getPriority()>t1.getPriority())
            return 1;
        if (patient.getPriority()<t1.getPriority())
            return -1;
        if(patient.getId()>t1.getId())
            return 1;
        if (patient.getId()<t1.getId())
            return -1;
        return 0;
    }
}
