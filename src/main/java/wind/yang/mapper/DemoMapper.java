package wind.yang.mapper;

import wind.yang.dto.DemoDto;

import java.util.HashMap;

public interface DemoMapper {
    String getDual();
    DemoDto getDemo(int id);
    DemoDto getDemoByName(HashMap<String,String> param);
}
