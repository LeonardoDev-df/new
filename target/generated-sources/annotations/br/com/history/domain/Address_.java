package br.com.history.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> zipCode;
	public static volatile SingularAttribute<Address, String> number;
	public static volatile SingularAttribute<Address, String> uf;
	public static volatile SingularAttribute<Address, String> province;
	public static volatile SingularAttribute<Address, String> streetAddress;
	public static volatile SingularAttribute<Address, String> city;
	public static volatile SingularAttribute<Address, String> latitude;
	public static volatile SingularAttribute<Address, Long> id;
	public static volatile SingularAttribute<Address, String> complement;
	public static volatile SingularAttribute<Address, String> longitude;
	public static volatile SingularAttribute<Address, Boolean> status;

	public static final String ZIP_CODE = "zipCode";
	public static final String NUMBER = "number";
	public static final String UF = "uf";
	public static final String PROVINCE = "province";
	public static final String STREET_ADDRESS = "streetAddress";
	public static final String CITY = "city";
	public static final String LATITUDE = "latitude";
	public static final String ID = "id";
	public static final String COMPLEMENT = "complement";
	public static final String LONGITUDE = "longitude";
	public static final String STATUS = "status";

}

