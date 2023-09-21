package meetona.core.interfaces;

import meetona.core.payload.request.UnitRequest;
import meetona.core.payload.response.ApiResponse;
import meetona.core.payload.response.UnitDto;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IUnitService {
    ApiResponse<List<UnitDto>> getAll(Pageable pageable);
    ApiResponse<UnitDto> getById(UUID id);
    ApiResponse<UnitDto> add(UnitRequest unitRequest);
    ApiResponse<UnitDto> update(UUID id, UnitRequest unitRequest);
    ApiResponse<UnitDto> delete(UUID id);
}
