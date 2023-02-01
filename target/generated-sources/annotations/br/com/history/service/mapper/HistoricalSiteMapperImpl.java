package br.com.history.service.mapper;

import br.com.history.domain.HistoricalSite;
import br.com.history.domain.SiteImage;
import br.com.history.domain.User;
import br.com.history.service.dto.HistoricalSiteDTO;
import br.com.history.service.dto.HistoricalSiteIdDTO;
import br.com.history.service.dto.HistoricalSiteUpdateStatusDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-01T13:34:10-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20221215-1352, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class HistoricalSiteMapperImpl implements HistoricalSiteMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<HistoricalSite> toEntity(List<HistoricalSiteDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<HistoricalSite> list = new ArrayList<HistoricalSite>( dtoList.size() );
        for ( HistoricalSiteDTO historicalSiteDTO : dtoList ) {
            list.add( toEntity( historicalSiteDTO ) );
        }

        return list;
    }

    @Override
    public List<HistoricalSiteDTO> toDto(List<HistoricalSite> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<HistoricalSiteDTO> list = new ArrayList<HistoricalSiteDTO>( entityList.size() );
        for ( HistoricalSite historicalSite : entityList ) {
            list.add( toDto( historicalSite ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(HistoricalSite entity, HistoricalSiteDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.id( dto.getId() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getDescription() != null ) {
            entity.setDescription( dto.getDescription() );
        }
        if ( dto.getLike() != null ) {
            entity.setLike( dto.getLike() );
        }
        if ( dto.getComment() != null ) {
            entity.setComment( dto.getComment() );
        }
        if ( dto.getStatus() != null ) {
            entity.setStatus( dto.getStatus() );
        }
        if ( dto.getLink() != null ) {
            entity.setLink( dto.getLink() );
        }
        if ( dto.getAddress() != null ) {
            entity.setAddress( addressMapper.toEntity( dto.getAddress() ) );
        }
        if ( entity.getSiteImages() != null ) {
            Set<SiteImage> set = dto.getSiteImages();
            if ( set != null ) {
                entity.getSiteImages().clear();
                entity.getSiteImages().addAll( set );
            }
        }
        else {
            Set<SiteImage> set = dto.getSiteImages();
            if ( set != null ) {
                entity.setSiteImages( new HashSet<SiteImage>( set ) );
            }
        }
    }

    @Override
    public HistoricalSiteDTO toDto(HistoricalSite s) {
        if ( s == null ) {
            return null;
        }

        HistoricalSiteDTO historicalSiteDTO = new HistoricalSiteDTO();

        historicalSiteDTO.setId( s.getId() );
        historicalSiteDTO.setName( s.getName() );
        historicalSiteDTO.setDescription( s.getDescription() );
        historicalSiteDTO.setLike( s.getLike() );
        historicalSiteDTO.setComment( s.getComment() );
        historicalSiteDTO.setStatus( s.getStatus() );
        historicalSiteDTO.setLink( s.getLink() );
        historicalSiteDTO.setAddress( addressMapper.toDto( s.getAddress() ) );
        Set<SiteImage> set = s.getSiteImages();
        if ( set != null ) {
            historicalSiteDTO.setSiteImages( new HashSet<SiteImage>( set ) );
        }

        return historicalSiteDTO;
    }

    @Override
    public HistoricalSiteDTO toDtoId(HistoricalSite historicalSite) {
        if ( historicalSite == null ) {
            return null;
        }

        HistoricalSiteDTO historicalSiteDTO = new HistoricalSiteDTO();

        historicalSiteDTO.setId( historicalSite.getId() );

        return historicalSiteDTO;
    }

    @Override
    public HistoricalSite toEntity(HistoricalSiteDTO historicalSiteDTO) {
        if ( historicalSiteDTO == null ) {
            return null;
        }

        HistoricalSite historicalSite = new HistoricalSite();

        historicalSite.setUser( historicalSiteDTOToUser( historicalSiteDTO ) );
        historicalSite.id( historicalSiteDTO.getId() );
        historicalSite.setName( historicalSiteDTO.getName() );
        historicalSite.setDescription( historicalSiteDTO.getDescription() );
        historicalSite.setLike( historicalSiteDTO.getLike() );
        historicalSite.setComment( historicalSiteDTO.getComment() );
        historicalSite.setStatus( historicalSiteDTO.getStatus() );
        historicalSite.setLink( historicalSiteDTO.getLink() );
        historicalSite.setAddress( addressMapper.toEntity( historicalSiteDTO.getAddress() ) );
        Set<SiteImage> set = historicalSiteDTO.getSiteImages();
        if ( set != null ) {
            historicalSite.setSiteImages( new HashSet<SiteImage>( set ) );
        }

        return historicalSite;
    }

    @Override
    public HistoricalSite historicalSiteUpdateStatusDTOtoHistoricalSite(HistoricalSiteUpdateStatusDTO historicalSiteUpdateStatusDTO) {
        if ( historicalSiteUpdateStatusDTO == null ) {
            return null;
        }

        HistoricalSite historicalSite = new HistoricalSite();

        historicalSite.setComment( historicalSiteUpdateStatusDTO.getComment() );
        historicalSite.setStatus( historicalSiteUpdateStatusDTO.getStatus() );
        historicalSite.setLink( historicalSiteUpdateStatusDTO.getLink() );

        return historicalSite;
    }

    @Override
    public HistoricalSiteIdDTO historicalSitetoHistoricalSiteIdDTO(HistoricalSite historicalSite) {
        if ( historicalSite == null ) {
            return null;
        }

        HistoricalSiteIdDTO historicalSiteIdDTO = new HistoricalSiteIdDTO();

        historicalSiteIdDTO.setId( historicalSite.getId() );
        historicalSiteIdDTO.setName( historicalSite.getName() );
        historicalSiteIdDTO.setDescription( historicalSite.getDescription() );
        historicalSiteIdDTO.setLike( historicalSite.getLike() );
        historicalSiteIdDTO.setComment( historicalSite.getComment() );
        historicalSiteIdDTO.setStatus( historicalSite.getStatus() );
        historicalSiteIdDTO.setLink( historicalSite.getLink() );
        historicalSiteIdDTO.setAddress( addressMapper.toDto( historicalSite.getAddress() ) );

        return historicalSiteIdDTO;
    }

    protected User historicalSiteDTOToUser(HistoricalSiteDTO historicalSiteDTO) {
        if ( historicalSiteDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( historicalSiteDTO.getIdUser() );

        return user;
    }
}
