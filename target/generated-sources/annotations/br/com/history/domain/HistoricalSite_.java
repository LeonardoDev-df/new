package br.com.history.domain;

import br.com.history.domain.enumeration.StatusEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistoricalSite.class)
public abstract class HistoricalSite_ {

	public static volatile SingularAttribute<HistoricalSite, Address> address;
	public static volatile SetAttribute<HistoricalSite, SiteImage> siteImages;
	public static volatile SingularAttribute<HistoricalSite, Integer> like;
	public static volatile SingularAttribute<HistoricalSite, String> name;
	public static volatile SingularAttribute<HistoricalSite, String> link;
	public static volatile SingularAttribute<HistoricalSite, String> description;
	public static volatile SingularAttribute<HistoricalSite, String> comment;
	public static volatile SingularAttribute<HistoricalSite, Long> id;
	public static volatile SingularAttribute<HistoricalSite, User> user;
	public static volatile SingularAttribute<HistoricalSite, StatusEnum> status;

	public static final String ADDRESS = "address";
	public static final String SITE_IMAGES = "siteImages";
	public static final String LIKE = "like";
	public static final String NAME = "name";
	public static final String LINK = "link";
	public static final String DESCRIPTION = "description";
	public static final String COMMENT = "comment";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String STATUS = "status";

}

