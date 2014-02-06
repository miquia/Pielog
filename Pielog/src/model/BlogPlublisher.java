package model;

public interface BlogPlublisher {
	public void register(BlogListener client);
	public void unregister(BlogListener client);
	public void notifyClients(String component, String body);
}
