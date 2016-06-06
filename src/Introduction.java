
public class Introduction {

}
 //Essential JMX terms
	
	//Manageable resource
	
	/*A manageable resource is any application, device, or existing entity that can be
	accessed or wrapped by Java. It is the entity that will be exposed for management
	by using JMX.
	
	Manageable resources can even be
	network devices such as printers. The manageable resource is the entity managed
	by a JMX MBean.*/

	//MBean

	/*An MBean (managed bean) is a Java class that meets certain naming and inheritance
	standards dictated by the JMX specification. Instantiated MBeans are Java
	objects that expose management interfaces for the manipulation and access of
	manageable resources. An MBean’s management interface is made up of the
	MBean’s attributes and operations that are exposed for management.
	
	Three types of MBeans: Standard, Dynamic, and Model MBeans. 
	
	MBeans reside in another JMX component called the MBean server.*/

	//MBean server
	
	/*An MBean server is a Java class that manages a group of MBeans. It is the heart
	of the JMX management environment—it acts as a registry for looking up
	MBeans. The MBean server exposes the management interface of any registered
	MBean, but it never exposes the object reference. In addition, the MBean server
	is implemented to present users with an identical interface regardless of the type
	of MBean being accessed: it treats all MBeans equally. The MBean server also
	provides methods for performing queries to find MBeans and for other objects
	to register as notification listeners (like event listeners) with MBeans.*/

	//JMX agent

	/*A JMX agent is a Java process that provides a set of services for managing a set of
	MBeans—it is the container for an MBean server. JMX agents provide services
	for creating MBean relationships, dynamically loading classes, simple monitoring
	services, and timers.
	Agents can expect to have a set of protocol adapters and connectors that
	enable remote and different clients to make use of the agent. Protocol adapters
	and connectors are Java classes, usually MBeans, which can internally map an
	outside protocol (like HTTP or SNMP) or expose the agent to remote connectivity
	(like RMI or Jini). This means JMX agents can be used by a variety of different
	management protocols and tools.*/

	//Protocol adapters and connectors

	/*Protocol adapters and connectors are objects residing within a JMX agent that
	expose the agent to management application and protocols. For example, SNMP
	could be mapped into a JMX agent using an SNMP adapter object of the agent.
	In addition, an agent could have an RMI connector that opens it up for management
	applications that use RMI clients. Protocol adapters consist of a single
	object within an agent, whereas connectors have both an object in the agent and
	an object used by a client.
	An agent can have any number of adapters and connectors, essentially giving
	you the ability to reach the agent using new tools or existing management protocols
	and applications. Not only does your agent have the flexibility to be managed
	by many applications, but you also have a mechanism for distributing
	agents across a network.*/

	//Management application
	
	/*A management application is any user application that is used to interface to any
	number of JMX agents. JMX agents can work with management applications
	designed to work with JMX technology or those that are not. A compatible JMX
	management application will be able to take advantage of JMX’s advanced features.
	You can provide a JMX agent with the ability to interact with existing (non-
	JMX) managers by writing custom adapters and connectors. For instance, an
	SNMP manager can be used to work with JMX agents by creating an SNMP
	adapter. Later in this book, we will work with connectors and adapters covering
	RMI, Jini, and TCP.*/
	
	//Notification
	/*Notifications are Java objects emitted by MBeans and the MBean server to
	encapsulate events, alerts, or general information. Other MBeans or Java objects
	can register as listeners to receive notifications. In fact, the JMX notification
	model is similar to the Java event model, as you will see in chapter 6.*/
	
	//Instrumentation
	/*Instrumentation is the process of exposing a manageable resource using an
	MBean (or set of MBeans). Instrumentation of an application can take place
	alongside development, or developers can work to create MBeans that use existing
	APIs of currently active systems. You will discover that with several types of
	MBeans from which to choose, you will be able to find an easy way to expose
	parts of your applications and resources to JMX.*/