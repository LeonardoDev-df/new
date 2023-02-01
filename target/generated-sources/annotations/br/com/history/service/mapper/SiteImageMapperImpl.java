package br.com.history.service.mapper;

import br.com.history.domain.SiteImage;
import br.com.history.service.dto.SiteImageDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-01T13:34:10-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20221215-1352, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class SiteImageMapperImpl implements SiteImageMapper {

    @Override
    public SiteImage toEntity(SiteImageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SiteImage siteImage = new SiteImage();

        siteImage.id( dto.getId() );
        siteImage.setNumberImage( dto.getNumberImage() );
        byte[] image3D = dto.getImage3D();
        if ( image3D != null ) {
            siteImage.setImage3D( Arrays.copyOf( image3D, image3D.length ) );
        }
        byte[] imagePreview = dto.getImagePreview();
        if ( imagePreview != null ) {
            siteImage.setImagePreview( Arrays.copyOf( imagePreview, imagePreview.length ) );
        }
        siteImage.setYear( dto.getYear() );

        return siteImage;
    }

    @Override
    public List<SiteImage> toEntity(List<SiteImageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SiteImage> list = new ArrayList<SiteImage>( dtoList.size() );
        for ( SiteImageDTO siteImageDTO : dtoList ) {
            list.add( toEntity( siteImageDTO ) );
        }

        return list;
    }

    @Override
    public List<SiteImageDTO> toDto(List<SiteImage> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SiteImageDTO> list = new ArrayList<SiteImageDTO>( entityList.size() );
        for ( SiteImage siteImage : entityList ) {
            list.add( toDto( siteImage ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(SiteImage entity, SiteImageDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.id( dto.getId() );
        }
        if ( dto.getNumberImage() != null ) {
            entity.setNumberImage( dto.getNumberImage() );
        }
        byte[] image3D = dto.getImage3D();
        if ( image3D != null ) {
            entity.setImage3D( Arrays.copyOf( image3D, image3D.length ) );
        }
        byte[] imagePreview = dto.getImagePreview();
        if ( imagePreview != null ) {
            entity.setImagePreview( Arrays.copyOf( imagePreview, imagePreview.length ) );
        }
        if ( dto.getYear() != null ) {
            entity.setYear( dto.getYear() );
        }
    }

    @Override
    public SiteImageDTO toDto(SiteImage s) {
        if ( s == null ) {
            return null;
        }

        SiteImageDTO siteImageDTO = new SiteImageDTO();

        siteImageDTO.setId( s.getId() );
        siteImageDTO.setNumberImage( s.getNumberImage() );
        byte[] image3D = s.getImage3D();
        if ( image3D != null ) {
            siteImageDTO.setImage3D( Arrays.copyOf( image3D, image3D.length ) );
        }
        byte[] imagePreview = s.getImagePreview();
        if ( imagePreview != null ) {
            siteImageDTO.setImagePreview( Arrays.copyOf( imagePreview, imagePreview.length ) );
        }
        siteImageDTO.setYear( s.getYear() );

        return siteImageDTO;
    }
}
