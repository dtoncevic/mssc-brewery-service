package darko.test.msscbeerservice.web.mappers;

import darko.test.msscbeerservice.domain.Beer;
import darko.test.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
