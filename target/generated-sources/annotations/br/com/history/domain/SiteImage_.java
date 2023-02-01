package br.com.history.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SiteImage.class)
public abstract class SiteImage_ {

	public static volatile SingularAttribute<SiteImage, Integer> numberImage;
	public static volatile SingularAttribute<SiteImage, Integer> year;
	public static volatile SingularAttribute<SiteImage, String> buttonColor;
	public static volatile SingularAttribute<SiteImage, byte[]> image3D;
	public static volatile SingularAttribute<SiteImage, Long> id;
	public static volatile SingularAttribute<SiteImage, HistoricalSite> historicalSite;
	public static volatile SingularAttribute<SiteImage, byte[]> imagePreview;
	public static volatile SingularAttribute<SiteImage, ButtonPosition> buttonPosition;

	public static final String NUMBER_IMAGE = "numberImage";
	public static final String YEAR = "year";
	public static final String BUTTON_COLOR = "buttonColor";
	public static final String IMAGE3_D = "image3D";
	public static final String ID = "id";
	public static final String HISTORICAL_SITE = "historicalSite";
	public static final String IMAGE_PREVIEW = "imagePreview";
	public static final String BUTTON_POSITION = "buttonPosition";

}

