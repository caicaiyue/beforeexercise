package headfirstmodeagain;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public void drive() {
		// TODO Auto-generated method stub
		PersonBean joe = new PersonBeanImpl();
		joe.setName("joe");
		System.out.println(joe);
		PersonBean ownerProxy = getOwnerProxy(joe);
		ownerProxy.setGender("Male");
		ownerProxy.setInterests("Play football");
		//ownerProxy.setHotOrNotRating(100);
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
	    nonOwnerProxy.setHotOrNotRating(100);
	    nonOwnerProxy.setHotOrNotRating(96);

	    System.out.println(ownerProxy.getHotOrNotRating());
	    System.out.println(joe);

	}

	private PersonBean getNonOwnerProxy(PersonBean person) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}

	public PersonBean getOwnerProxy(PersonBean person) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), new OwnInvocationHandler(person));
	}

}
