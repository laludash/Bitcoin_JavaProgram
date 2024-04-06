package Project5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PincodeController {

	   @Autowired
	    private PincodeService pincodeService;

	   @GetMapping("/code/{pincode}")
	   public ResponseEntity<List<PincodeEntity>> getLocationByPincode(@PathVariable String pincode) throws Exception
	   {
		   List<PincodeEntity> entity = pincodeService.loadData(pincode);
		   String msg = "found";
		//   List<PincodeEntity> entities  = entity;
		   if (!entity.isEmpty()) {
			 //  System.out.println("found the pincode");
			   return new ResponseEntity<>(entity, HttpStatus.OK);
	        } else {
	        	System.out.println(" not found the pincode");
	        	 return ResponseEntity.notFound().build();
	        }
	   }
	   
}
