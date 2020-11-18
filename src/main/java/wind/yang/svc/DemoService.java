package wind.yang.svc;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wind.yang.dto.DemoDto;
import wind.yang.exception.NoSearchResultException;
import wind.yang.mapper.DemoMapper;

import java.util.HashMap;

@Slf4j
@Service
public class DemoService {
    @Autowired
    DemoMapper demoMapper;

    public DemoDto getDemoDto(int id) throws Exception {
        String now = demoMapper.getDual();
        DemoDto demoDto = demoMapper.getDemo(id);

        log.debug("now : {}, demoDto : {}", now, demoDto);

        return demoMapper.getDemo(id);
    }

    public DemoDto getDemoByName(String name) {
        HashMap<String, String> param = new HashMap<>();
        param.put("name", name);

        DemoDto demoDto = demoMapper.getDemoByName(param);
        if(demoDto == null){
            throw new NoSearchResultException("조회결과가 없습니다.");
        }

        log.debug("getDemoByName() : {}", demoDto);

        return demoDto;
    }
}
