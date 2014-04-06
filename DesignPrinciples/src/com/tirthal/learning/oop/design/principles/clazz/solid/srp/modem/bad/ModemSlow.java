/**
 * 
 */
package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad;

/**
 * Implementation class of modem interface for "slow mode" of data send and receive. This is for design demo, so actual logic is not implemented
 * 
 * @author tirthalp
 */
public class ModemSlow implements IModem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad.IModem#dial(java.lang.String)
	 */
	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("connected successfully");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad.IModem#disconnect()
	 */
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnection successfully");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad.IModem#send(char)
	 */
	@Override
	public void send(char c) {
		// TODO Auto-generated method stub
		System.out.println("data sent successfully usign slow algorithms");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad.IModem#receive()
	 */
	@Override
	public char receive() {
		// TODO Auto-generated method stub
		System.out.println("data received successfully using slow algorithms");
		return 0;
	}

}
