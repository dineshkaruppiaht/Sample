package com.sample.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.entities.EmailprofileConfig;

@Repository
public class EmailConfigRepository {
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<EmailprofileConfig> findAllValues() {
		return (List<EmailprofileConfig>) getSession().createQuery("from EmailprofileConfig").list();
	}

	public void save(EmailprofileConfig emailprofile) {
		if (emailprofile != null) {
			getSession().save(emailprofile);
		}
	}

	public void update(EmailprofileConfig emailprofile) {
		if (emailprofile != null) {
			System.out.println("Value >>>" + emailprofile.getCarriercode());
			getSession()
					.createQuery("update EmailprofileConfig set carriercode = :Carriercode," + "smtphost = :Smtphost,"
							+ "smtpport = :Smtpport," + "authuser = :Authuser," + "authpassword = :Authpassword,"
							+ "mode = :Mode," + "bound = :Bound," + "defaultsenderid = :Defaultsenderid,"
							+ "authrequired = :Authrequired," + "store_type = :Store_type," + "schedule = :Schedule,"
							+ "unit = :Unit," + "isenabled = :Isenabled," + "reschedulestatus = :Reschedulestatus,"
							+ "vhbschedule = :Vhbschedule," + "vhbscheduleunit = :Vhbscheduleunit "
							+ "where profileid = :Profileid")
					.setParameter("Carriercode", emailprofile.getCarriercode())
					.setParameter("Smtphost", emailprofile.getSmtphost())
					.setParameter("Smtpport", emailprofile.getSmtpport())
					.setParameter("Authuser", emailprofile.getAuthuser())
					.setParameter("Authpassword", emailprofile.getAuthpassword())
					.setParameter("Mode", emailprofile.getMode()).setParameter("Bound", emailprofile.getBound())
					.setParameter("Defaultsenderid", emailprofile.getDefaultsenderid())
					.setParameter("Authrequired", emailprofile.getAuthrequired())
					.setParameter("Store_type", emailprofile.getStore_type())
					.setParameter("Schedule", emailprofile.getSchedule()).setParameter("Unit", emailprofile.getUnit())
					.setParameter("Isenabled", emailprofile.getIsenabled())
					.setParameter("Reschedulestatus", emailprofile.getReschedulestatus())
					.setParameter("Vhbschedule", emailprofile.getVhbschedule())
					.setParameter("Vhbscheduleunit", emailprofile.getVhbscheduleunit())
					.setParameter("Profileid", emailprofile.getProfileid()).executeUpdate();
		}
	}

	public int delete(EmailprofileConfig emailprofile) {
		int value = 0;
		if (emailprofile != null) {
			String profileid = emailprofile.getProfileid();
			value = getSession().createQuery("delete from EmailprofileConfig where profileid = :Profileid")
					.setParameter("Profileid", profileid).executeUpdate();
			System.out.println("Value >>>>>" + value);
		}
		return value;
	}
}
