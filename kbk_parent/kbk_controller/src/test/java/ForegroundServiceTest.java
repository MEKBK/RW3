
import com.kbk.model.Message;
import com.kbk.model.Title;
import com.kbk.model.Work;
import com.kbk.service.Impl.MessageServiceImpl;
import com.kbk.service.Impl.TitleServiceImpl;
import com.kbk.service.Impl.WorkServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ForegroundServiceTest {

    // 也可用 @Autowired
    @Resource
    private MessageServiceImpl messageService;
    @Resource
    private TitleServiceImpl titleService;
    @Resource
    private WorkServiceImpl workService;

    /**
     *  添加留言
     */
    @Test
    public void testInsertMessage() throws Exception {
        Message message = new Message();
        message.setWorkId((long) 10);
        message.setContents("这幅画很好看");
        message.setStatus(0);
        message.setTouristName("艺术家");
        message.setRoleId((long) 1);
        message.setWorkId((long) 12);
        message.setCreatedTime(System.currentTimeMillis());
        message.setUpdatedTime(System.currentTimeMillis());
        message.setReplyId((long) 6);
        messageService.insertMessage(message);
        System.out.println(message);
    }




    /**
     *  根据ID查询所有
     */
    @Test
    public void testSelectWorksById() throws Exception {
        System.out.println(workService.selectWorksById((long) 1));
    }
}
