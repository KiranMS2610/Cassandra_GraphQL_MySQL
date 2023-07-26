package com.solarwinds.in.service.datafetcher;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.solarwinds.in.model.Latency_stats;
import com.solarwinds.in.repository.PropertyRepository;
import com.google.gson.Gson; // Import Gson

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class PropertyDataFetcher implements DataFetcher<List<Latency_stats>> 
	{ // Change the return type to String

    @Autowired
    private PropertyRepository propertyRepository;	
    
    @Autowired
    private Gson gson; // Inject the Gson bean
    
    @Override
    public List<Latency_stats> get(DataFetchingEnvironment environment) {
//        List<Latency_stats> latencyStatsList = propertyRepository.findAll();
//        // Use Gson to serialize the list to JSON
//        return latencyStatsList;
    	return propertyRepository.findAll();
    }
}
