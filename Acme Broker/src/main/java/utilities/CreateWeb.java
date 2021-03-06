package utilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import security.Authority;
import security.UserAccount;

import domain.*;
@SuppressWarnings("unused")
public class CreateWeb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	
		//ACTORS
		Supplier supplier1=new Supplier();
		supplier1.setName("John");
		supplier1.setSurname("Doe");
		supplier1.setEmailAdress("johndoe@acme.com");
		supplier1.setCompanyName("company1");
		supplier1.setTicker("aq12321-araer2");
		supplier1.setItems(new ArrayList<Item>());
		
		Supplier supplier2=new Supplier();
		supplier2.setName("Francis");
		supplier2.setSurname("Ryan");
		supplier2.setEmailAdress("fryan@acme.com");
		supplier2.setCompanyName("company2");
		supplier2.setTicker("1w3easwe13d");
		supplier2.setItems(new ArrayList<Item>());
		
		Consumer consumer1=new Consumer();
		consumer1.setName("Ramona");
		consumer1.setSurname("Flowers");
		consumer1.setEmailAdress("7ex@gmail.com");
		consumer1.setCompanyName("company3");
		consumer1.setTicker("afafa-afgiage");
		
		Consumer consumer2=new Consumer();
		consumer2.setName("Consumer");
		consumer2.setSurname("2");
		consumer2.setEmailAdress("consumer2@acme.com");
		consumer2.setCompanyName("company4");
		consumer2.setTicker("gagdayuwgadg");
		
		Auditor auditor1=new Auditor();
		auditor1.setName("Spongebob");
		auditor1.setSurname("Squarepants");
		auditor1.setEmailAdress("sponge@acme.com");
		auditor1.setRecords(new ArrayList<AuditRecord>());
		
		Auditor auditor2=new Auditor();
		auditor2.setName("Auditor");
		auditor2.setSurname("1");
		auditor2.setEmailAdress("auditor1@acme.com");
		auditor2.setRecords(new ArrayList<AuditRecord>());
		
		Administrator administrator1=new Administrator();
		administrator1.setName("Admin");
		administrator1.setSurname("1");
		administrator1.setEmailAdress("admin1@acme.com");
		administrator1.setRequests(new ArrayList<Request>());
		
		Administrator administrator2=new Administrator();
		administrator2.setName("Admin");
		administrator2.setSurname("2");
		administrator2.setEmailAdress("admin2@acme.com");
		administrator2.setRequests(new ArrayList<Request>());
		
		//CREDIT CARDS AND ADD THEM TO THE ACTORS
		CreditCard credit1=new CreditCard();
		credit1.setHolderName("John");
		credit1.setBrandName("Brand1");
		credit1.setNumber("735419965");
		credit1.setExpirationMonth(11);
		credit1.setExpirationYear(2015);
		credit1.setCvvCode(123);
		supplier1.setCreditcard(credit1);
		
		CreditCard credit2=new CreditCard();
		credit2.setHolderName("Francis");
		credit2.setBrandName("Brand2");
		credit2.setNumber("0754334534");
		credit2.setExpirationMonth(2);
		credit2.setExpirationYear(2016);
		credit2.setCvvCode(543);
		supplier2.setCreditcard(credit2);
		
		CreditCard credit3=new CreditCard();
		credit3.setHolderName("Ramona");
		credit3.setBrandName("Brand3");
		credit3.setNumber("351467532");
		credit3.setExpirationMonth(5);
		credit3.setExpirationYear(2016);
		credit3.setCvvCode(654);
		consumer1.setCreditcard(credit3);

		CreditCard credit4=new CreditCard();
		credit4.setHolderName("Consumer");
		credit4.setBrandName("Brand3");
		credit4.setNumber("0674327");
		credit4.setExpirationMonth(10);
		credit4.setExpirationYear(2017);
		credit4.setCvvCode(768);
		consumer2.setCreditcard(credit4);
		
		//Money
		Money money1=new Money();
		money1.setAmount(9.5);
		money1.setCurrency("$");
		
		Money money2=new Money();
		money2.setAmount(11.0);
		money2.setCurrency("$");
		
		Money money3=new Money();
		money3.setAmount(13.0);
		money3.setCurrency("$");
		
		Money money4=new Money();
		money4.setAmount(35.60);
		money4.setCurrency("$");
		
		//Items suppliers
		Item item1=new Item();
		item1.setName("Item1");
		item1.setPrice(money1);
		List<String> tag=new ArrayList<String>();
		tag.add("tag1");
		item1.setTags(tag);
		item1.setDescription("descripción 1");
		item1.setCode("1002gag-tann421");
		item1.setSupplier(supplier1);
		supplier1.getItems().add(item1);
		
		Item item2=new Item();
		item2.setName("Item2");
		item2.setPrice(money2);
		item2.setDescription("descripción 2");
		item2.setCode("a2r1aa-ahga236wey");
		item2.setSupplier(supplier2);
		supplier1.getItems().add(item2);
		

		//CURRICULUM
		Curriculum curriculum1=new Curriculum();
		curriculum1.setWebAddress("http://www.company1.com");
		curriculum1.setMission("mission1");
		curriculum1.setVision("vision1");
		curriculum1.setValues("value1");
		curriculum1.setStatement("statement1");
		supplier1.setCurriculum(curriculum1);
		
		Curriculum curriculum2=new Curriculum();
		curriculum2.setWebAddress("http://www.company3.com");
		curriculum2.setMission("mission2");
		curriculum2.setVision("vision2");
		curriculum2.setValues("value2");
		curriculum2.setStatement("statement2");
		consumer1.setCurriculum(curriculum2);
		
		//Contract
		Contract contract1=new Contract();
		contract1.setAdministrator(administrator1);
		contract1.setText("Text from contract 1");
		contract1.setDateSignedContractor(null);
		contract1.setDateSignedContractHolder(new Date(2013, 2, 16));
		contract1.setCancelled(false);
		contract1.setCreationMoment(new Date(2013, 2, 10));
		contract1.setEndMoment(new Date(2014,7,23));
		contract1.setIsSigned(false);
		administrator1.getContracts().add(contract1);
		
		Contract contract2=new Contract();
		contract2.setAdministrator(administrator2);
		contract2.setText("Text from contract 2");
		contract2.setDateSignedContractor(new Date(2014, 1, 5));
		contract2.setDateSignedContractHolder(new Date(2014, 1, 5));
		contract2.setCancelled(false);
		contract2.setCreationMoment(new Date(2013, 12, 30));
		contract2.setEndMoment(new Date(2014, 10, 10));
		contract2.setIsSigned(true);
		administrator2.getContracts().add(contract2);
		
		//INVOICES
		Invoice invoice1=new Invoice();
		invoice1.setCreationMoment(new Date(2014,1,5));
		invoice1.setPaymentMoment(new Date());
		invoice1.setCost(money3);
		invoice1.setContract(contract1);
		List<Invoice> inv1=new ArrayList<Invoice>();
		inv1.add(invoice1);
		contract1.setInvoices(inv1);
		
		Invoice invoice2=new Invoice();
		invoice1.setCreationMoment(new Date());
		invoice1.setCost(money4);
		invoice1.setContract(contract2);
		List<Invoice> inv2=new ArrayList<Invoice>();
		inv1.add(invoice2);
		contract1.setInvoices(inv2);
		
		//REQUESTS
		List<Request> requestsConsumer1=new ArrayList<Request>();
		List<Request> requestsConsumer2=new ArrayList<Request>();
		
		Request req1=new Request();
		req1.setEndMoment(new Date(2015, 8, 6));
		req1.setCode("req1");
		req1.setDescription("This is the Request 1");
		req1.setCreationMoment(new Date(2013, 1, 16));
		requestsConsumer1.add(req1);
		
		Request req2=new Request();
		req2.setEndMoment(new Date(2016, 2, 1));
		req2.setCode("req2");
		req2.setDescription("This is the Request 2");
		req2.setCreationMoment(new Date(2014, 3, 24));
		requestsConsumer2.add(req2);
		
		contract1.setRequest(req1);
		contract2.setRequest(req2);
		
		consumer1.setRequests(requestsConsumer1);
		consumer2.setRequests(requestsConsumer2);
				
		//ASSESMENT
		Assesment as1=new Assesment();
		as1.setComment("Comment for assesment 1");
		as1.setRating(50);
		as1.setCustomer(supplier1);
		as1.setContract(contract2);
		
		Assesment as2=new Assesment();
		as2.setComment("Comment for assesment 1");
		as2.setRating(60);
		as2.setCustomer(consumer1);
		as2.setContract(contract2);
		contract1.setAssesments(new ArrayList<Assesment>());
		List<Assesment> assesments=new ArrayList<Assesment>();
		assesments.add(as1);
		assesments.add(as2);
		contract2.setAssesments(assesments);
		
		//AUDITRECORDS
		List<String> incidents=new ArrayList();
		incidents.add("Incident 1");
		incidents.add("Incident 2");
		
		AuditRecord record1=new AuditRecord();
		record1.setCreationMoment(new Date(2013, 2, 12));
		record1.setStatement("Sample Statement");
		record1.setIncident(incidents);
		record1.setContract(contract1);
		record1.setAuditor(auditor1);
		auditor1.getRecords().add(record1);
		List<AuditRecord> records1=new ArrayList<AuditRecord>();
		records1.add(record1);
		contract1.setRecords(records1);
		
		AuditRecord record2=new AuditRecord();
		record2.setCreationMoment(new Date(2014, 1, 10));
		record2.setStatement("Sample Statement");
		record2.setIncident(incidents);
		record2.setContract(contract2);
		record2.setAuditor(auditor1);
		auditor1.getRecords().add(record2);
		List<AuditRecord> records2=new ArrayList<AuditRecord>();
		records2.add(record2);
		contract2.setRecords(records2);
		
		//MESSAGES
		Message message1=new Message();
		message1.setSender(supplier1);
		message1.setRecipent(consumer1);
		message1.setSubject("Contract");
		message1.setMoment(new Date());
		message1.setBody("Body of first message");
		
		
		Message message2=new Message();
		message2.setSender(supplier2);
		message2.setRecipent(consumer2);
		message2.setSubject("Contract");
		message2.setMoment(new Date());
		message2.setBody("Body of second message");
		
		Message message3=new Message();
		message3.setSender(supplier1);
		message3.setRecipent(consumer1);
		message3.setSubject("Contract");
		message3.setMoment(new Date());
		message3.setBody("Body of first message");
		
		Message message4=new Message();
		message4.setSender(supplier2);
		message4.setRecipent(consumer2);
		message4.setSubject("Contract");
		message4.setMoment(new Date());
		message4.setBody("Body of second message");	
		
		//FOLDER Supplier 1
		Folder inbox1=new Folder();
		inbox1.setActor(supplier1);
		inbox1.setName("Inbox");
		inbox1.setFolderChilds(new ArrayList<Folder>());
		inbox1.setFolderParent(null);
		inbox1.setMessages(new ArrayList<Message>());
		
		
		Folder outbox1=new Folder();
		outbox1.setActor(supplier1);
		List<Message> messages1=new ArrayList<Message>();
		messages1.add(message1);
		outbox1.setMessages(messages1);
		outbox1.setName("Outbox");
		outbox1.setFolderChilds(new ArrayList<Folder>());
		outbox1.setFolderParent(null);
		outbox1.setMessages(messages1);
		message1.setFolder(outbox1);
		
		supplier1.setInbox(inbox1);
		supplier1.setOutbox(outbox1);
		
		//FOLDER Supplier 2
		Folder inbox2=new Folder();
		inbox2.setActor(supplier2);
		inbox2.setName("Inbox");
		inbox2.setFolderChilds(new ArrayList<Folder>());
		inbox2.setFolderParent(null);
		inbox2.setMessages(new ArrayList<Message>());
		
		Folder outbox2=new Folder();
		outbox2.setActor(supplier2);
		List<Message> messages2=new ArrayList<Message>();
		messages2.add(message2);
		outbox2.setMessages(messages2);
		outbox2.setName("Outbox");
		outbox2.setFolderChilds(new ArrayList<Folder>());
		outbox2.setFolderParent(null);
		message2.setFolder(outbox2);
		
		supplier2.setInbox(inbox2);
		supplier2.setOutbox(outbox2);
		
		//FOLDER Consumer 1
		Folder inbox3=new Folder();
		inbox3.setActor(consumer1);
		inbox3.setName("Inbox");
		List<Message> messages3=new ArrayList<Message>();
		messages3.add(message3);
		inbox3.setMessages(messages3);
		inbox3.setFolderChilds(new ArrayList<Folder>());
		inbox3.setFolderParent(null);
		message3.setFolder(inbox3);
		
		Folder outbox3=new Folder();
		outbox3.setActor(consumer1);
		outbox3.setName("Outbox");
		outbox3.setFolderChilds(new ArrayList<Folder>());
		outbox3.setFolderParent(null);
		outbox3.setMessages(new ArrayList<Message>());
		
		consumer1.setInbox(inbox3);
		consumer1.setOutbox(outbox3);
		
		//FOLDER Consumer 2
		Folder inbox4=new Folder();
		inbox4.setActor(consumer2);
		inbox4.setName("Inbox");
		List<Message> messages4=new ArrayList<Message>();
		messages4.add(message4);
		inbox4.setMessages(messages4);
		inbox4.setFolderChilds(new ArrayList<Folder>());
		inbox4.setFolderParent(null);
		message4.setFolder(inbox4);
		
		Folder outbox4=new Folder();
		outbox4.setActor(consumer2);
		outbox4.setName("Outbox");
		outbox4.setFolderChilds(new ArrayList<Folder>());
		outbox4.setFolderParent(null);
		outbox4.setMessages(new ArrayList<Message>());
		
		consumer2.setInbox(inbox4);
		consumer2.setOutbox(outbox4);
		
		//FOLDER Auditor 1
		Folder inbox5=new Folder();
		inbox5.setActor(auditor1);
		inbox5.setName("Inbox");
		inbox5.setFolderChilds(new ArrayList<Folder>());
		inbox5.setFolderParent(null);
		inbox5.setMessages(new ArrayList<Message>());
		
		Folder outbox5=new Folder();
		outbox5.setActor(auditor1);
		outbox5.setName("Outbox");
		outbox5.setFolderChilds(new ArrayList<Folder>());
		outbox5.setFolderParent(null);
		outbox5.setMessages(new ArrayList<Message>());
		
		auditor1.setInbox(inbox5);
		auditor1.setOutbox(outbox5);
		
		//FOLDER Auditor 2
		Folder inbox6=new Folder();
		inbox6.setActor(auditor2);
		inbox6.setName("Inbox");
		inbox6.setFolderChilds(new ArrayList<Folder>());
		inbox6.setFolderParent(null);
		inbox6.setMessages(new ArrayList<Message>());
		
		Folder outbox6=new Folder();
		outbox6.setActor(auditor2);
		outbox6.setName("Outbox");
		outbox6.setFolderChilds(new ArrayList<Folder>());
		outbox6.setFolderParent(null);
		outbox6.setMessages(new ArrayList<Message>());
		
		auditor2.setInbox(inbox6);
		auditor2.setOutbox(outbox6);
		
		//FOLDER Administrator
		Folder inbox7=new Folder();
		inbox7.setActor(administrator1);
		inbox7.setName("Inbox");
		inbox7.setFolderChilds(new ArrayList<Folder>());
		inbox7.setFolderParent(null);
		inbox7.setMessages(new ArrayList<Message>());

		Folder outbox7=new Folder();
		outbox7.setActor(administrator1);
		outbox7.setName("Outbox");
		outbox7.setFolderChilds(new ArrayList<Folder>());
		outbox7.setFolderParent(null);
		outbox7.setMessages(new ArrayList<Message>());
		
		administrator1.setInbox(inbox7);
		administrator1.setOutbox(outbox7);
		
		//FOLDER Administrator
		Folder inbox8=new Folder();
		inbox8.setActor(administrator2);
		inbox8.setName("Inbox");
		inbox8.setFolderChilds(new ArrayList<Folder>());
		inbox8.setFolderParent(null);
		inbox8.setMessages(new ArrayList<Message>());

		Folder outbox8=new Folder();
		outbox8.setActor(administrator2);
		outbox8.setName("Outbox");
		outbox8.setFolderChilds(new ArrayList<Folder>());
		outbox8.setFolderParent(null);
		outbox8.setMessages(new ArrayList<Message>());
		
		administrator2.setInbox(inbox8);
		administrator2.setOutbox(outbox8);
		
		//USER ACCOUNTS
		Authority aut1=new Authority();
		aut1.setAuthority("ADMIN");
		Authority aut2=new Authority();
		aut2.setAuthority("SUPPLIER");
		Authority aut3=new Authority();
		aut3.setAuthority("CONSUMER");
		Authority aut4=new Authority();
		aut4.setAuthority("AUDITOR");
		
		List<Authority> authority1=new ArrayList<Authority>();
		authority1.add(aut1);
		List<Authority> authority2=new ArrayList<Authority>();
		authority2.add(aut2);
		List<Authority> authority3=new ArrayList<Authority>();
		authority3.add(aut3);
		List<Authority> authority4=new ArrayList<Authority>();
		authority4.add(aut4);
		
		UserAccount adACC1=new UserAccount();
		adACC1.setAuthorities(authority1);
		adACC1.setUsername("admin1");
		UserAccount adACC2=new UserAccount();
		adACC2.setAuthorities(authority1);
		adACC2.setUsername("admin2");
		UserAccount supACC1=new UserAccount();
		supACC1.setAuthorities(authority2);
		supACC1.setUsername("supplier1");
		UserAccount supACC2=new UserAccount();
		supACC2.setAuthorities(authority2);
		supACC2.setUsername("supplier2");
		UserAccount conACC1=new UserAccount();
		conACC1.setAuthorities(authority3);
		conACC1.setUsername("consumer1");
		UserAccount conACC2=new UserAccount();
		conACC2.setAuthorities(authority3);
		conACC2.setUsername("consumer2");
		UserAccount audACC1=new UserAccount();
		audACC1.setAuthorities(authority4);
		audACC1.setUsername("auditor1");
		UserAccount audACC2=new UserAccount();
		audACC2.setAuthorities(authority4);
		audACC2.setUsername("auditor2");
		
		administrator1.setUserAcccount(adACC1);
		administrator2.setUserAcccount(adACC2);
		supplier1.setUserAcccount(supACC1);
		supplier2.setUserAcccount(supACC2);
		consumer1.setUserAcccount(conACC1);
		consumer2.setUserAcccount(conACC2);
		auditor1.setUserAcccount(audACC1);
		auditor2.setUserAcccount(audACC2);
		
		//SystemOutPrint
		
		System.out.println("\nADMINISTRATORS\n");
		System.out.println(administrator1);
		System.out.println(administrator2);
		System.out.println("\nSUPPLIERS\n");
		System.out.println(supplier1);
		System.out.println(supplier2);
		System.out.println("\nCONSUMERS\n");
		System.out.println(consumer1);
		System.out.println(consumer2);
		System.out.println("\nAUDITORS\n");
		System.out.println(auditor1);
		System.out.println(auditor2);
*/
	}

}
