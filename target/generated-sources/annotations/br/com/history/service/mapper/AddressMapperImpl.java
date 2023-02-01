package br.com.history.service.mapper;

import br.com.history.domain.Address;
import br.com.history.service.dto.AddressDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-11T10:37:30-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toEntity(AddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.id( dto.getId() );
        address.setStreetAddress( dto.getStreetAddress() );
        address.setZipCode( dto.getZipCode() );
        address.setNumber( dto.getNumber() );
        address.setComplement( dto.getComplement() );
        address.setProvince( dto.getProvince() );
        address.setCity( dto.getCity() );
        address.setUf( dto.getUf() );
        address.setLongitude( dto.getLongitude() );
        address.setLatitude( dto.getLatitude() );
        address.setStatus( dto.getStatus() );

        return address;
    }

    @Override
    public AddressDTO toDto(Address entity) {
        if ( entity == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( entity.getId() );
        addressDTO.setStreetAddress( entity.getStreetAddress() );
        addressDTO.setZipCode( entity.getZipCode() );
        addressDTO.setNumber( entity.getNumber() );
        addressDTO.setComplement( entity.getComplement() );
        addressDTO.setProvince( entity.getProvince() );
        addressDTO.setCity( entity.getCity() );
        addressDTO.setUf( entity.getUf() );
        addressDTO.setLongitude( entity.getLongitude() );
        addressDTO.setLatitude( entity.getLatitude() );
        addressDTO.setStatus( entity.getStatus() );

        return addressDTO;
    }

    @Override
    public List<Address> toEntity(List<AddressDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( dtoList.size() );
        for ( AddressDTO addressDTO : dtoList ) {
            list.add( toEntity( addressDTO ) );
        }

        return list;
    }

    @Override
    public List<AddressDTO> toDto(List<Address> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( entityList.size() );
        for ( Address address : entityList ) {
            list.add( toDto( address ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Address entity, AddressDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.id( dto.getId() );
        }
        if ( dto.getStreetAddress() != null ) {
            entity.setStreetAddress( dto.getStreetAddress() );
        }
        if ( dto.getZipCode() != null ) {
            entity.setZipCode( dto.getZipCode() );
        }
        if ( dto.getNumber() != null ) {
            entity.setNumber( dto.getNumber() );
        }
        if ( dto.getComplement() != null ) {
            entity.setComplement( dto.getComplement() );
        }
        if ( dto.getProvince() != null ) {
            entity.setProvince( dto.getProvince() );
        }
        if ( dto.getCity() != null ) {
            entity.setCity( dto.getCity() );
        }
        if ( dto.getUf() != null ) {
            entity.setUf( dto.getUf() );
        }
        if ( dto.getLongitude() != null ) {
            entity.setLongitude( dto.getLongitude() );
        }
        if ( dto.getLatitude() != null ) {
            entity.setLatitude( dto.getLatitude() );
        }
        if ( dto.getStatus() != null ) {
            entity.setStatus( dto.getStatus() );
        }
    }

    @Override
    public AddressDTO toDtoId(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );

        return addressDTO;
    }
}
