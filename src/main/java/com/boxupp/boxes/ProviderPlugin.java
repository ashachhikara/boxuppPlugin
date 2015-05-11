package com.boxupp.boxes;

public interface ProviderPlugin {
	/*
	 * get all configuration depending on provider
	 * input :- providerType
	 *  output :-  return all configuration
	 */
	public <E> E getConfiguration(String provider);
	/*
	 * create velocity template
	 * input :- all database values which are required to create velocity template
	 *  output :-  return status about velocity template
	 */
	public <E> E prepareVelocityTemplate(E databaseValues);
	/*
	 * start machine
	 * input :- provider class
	 * return machine bean class according  to provider 
	 */
	public <E> E start(E provider);
	/*
	 * stop machine
	 * input :- provider class
	 * return machine bean class according to provider 
	 */
	public <E> E stop(E provider);
	/*
	 * delete machine
	 * input :- provider class
	 * return machine bean class according to provider 
	 */
	public <E> E delete(E provider);
	
	/*
	 * description for provider type
	 * return string
	 */
	public String description();

}
