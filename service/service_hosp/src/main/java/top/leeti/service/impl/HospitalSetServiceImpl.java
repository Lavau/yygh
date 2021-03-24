package top.leeti.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.leeti.mapper.HospitalSetMapper;
import top.leeti.model.hosp.HospitalSet;
import top.leeti.service.HospitalSetService;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet>
        implements HospitalSetService {
}
