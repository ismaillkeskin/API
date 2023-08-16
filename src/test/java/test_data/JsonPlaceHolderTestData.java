package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolderTestData {

   public Map<String,Object> expectedDataMethod(Integer userrId, String title, Boolean completed){

       Map<String, Object> expectedData = new HashMap<>();
       expectedData.put("userId",userrId);
       expectedData.put("title", title);
       expectedData.put("completed", completed);
       return expectedData;
   }


}


