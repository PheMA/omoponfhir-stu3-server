package edu.gatech.chai.omoponfhir.smart.dao;

import java.sql.Connection;
import java.util.List;

import edu.gatech.chai.omoponfhir.smart.model.SmartOnFhirAppEntry;

public interface SmartOnFhirApp {
	public Connection connect();

	public int save(SmartOnFhirAppEntry appEntry);
	public void update(SmartOnFhirAppEntry appEntry);
	public void delete(String appId);
	public List<SmartOnFhirAppEntry> get();
	public SmartOnFhirAppEntry getSmartOnFhirApp(String appId);
}
