
function map_Codes(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
	var db1 = dbConn();
	try {
		
		if(FACILITY.toString().length==0){   //if facility is not mentioned
			
			var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode , 3 , 1);
		}	
		else if(FACILITY.toString().length!=0){   //if facility is mentioned
			var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from" + TABLENAME + " where COMPANY='"+COMPANY+"' and FACILITY='"+FACILITY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode, 3 , 1);
	
		}
	}

	finally	{
		db1.close();
	}
}


function map_Desc(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
	var db1 = dbConn();
	try{
		
		if(FACILITY.toString().length==0){       //if facility is not mentioned
			var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from  "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode , 3 , 2);
		}
		else if(FACILITY.toString().length!=0){      //if facility is mentioned
			var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from  "+TABLENAME+" where COMPANY='"+COMPANY+"' and FACILITY='"+FACILITY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode , 3 , 2);
		}
	}

	finally	{
		db1.close();
	}
}

function is_untimed(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
	var db1 = dbConn();
	try {
		
		if(FACILITY.toString().length==0){   //if facility is not mentioned
			
			
			var getFacilitycode = " Select UNTIMED from "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode , 1 , 1);
		}	
		else if(FACILITY.toString().length!=0){   //if facility is mentioned
			var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from" + TABLENAME + " where COMPANY='"+COMPANY+"' and FACILITY='"+FACILITY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			return getContent(db1, getFacilitycode , 3 , 1);
		}
	}

	finally	{
		db1.close();
	}
}

var getFacilitycode = " Select UNTIMED from "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;


function map_Codes(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
function map_Desc(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
function is_untimed(TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE)

function getMappedValue(MAP,TABLENAME,COMPANY,FACILITY,APPLICATION,GID,CODE) {
	var db1 = dbConn();
	try {
		if(FACILITY.toString().length==0){   //if facility is not mentioned
			
                        var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
			switch (MAP) {
                            case 'mapCodes':
                              return getContent(db1, getFacilitycode , 3 , 1);
                            case 'mapDesc':
                              return getContent(db1, getFacilitycode , 3 , 2);
                            case 'isUntimed':
                               var getUntimedValue = " Select UNTIMED from "+TABLENAME+" where COMPANY='"+COMPANY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
                               return getContent(db1, getUntimedValue , 1 , 1);
                         }
 
            
		}	
		else if(FACILITY.toString().length!=0){   //if facility is mentioned
                        var getFacilitycode = " Select VAULTMR_CODE_VALUE,VAULTMR_CODE_DESC,IS_ACTIVE from" + TABLENAME + " where COMPANY='"+COMPANY+"' and FACILITY='"+FACILITY+"' and APPLICATION='"+APPLICATION+"' and CODE_TYPE_GID='"+GID+"' and SOURCE_CODE_VALUE='"+CODE+"'" ;
	                switch (MAP) {
                            case 'mapCodes':
                              return getContent(db1, getFacilitycode , 3 , 1);
                            case 'mapDesc':
                              return getContent(db1, getFacilitycode , 3 , 2);
                            
                         }
        	}
	}

	finally	{
		db1.close();
	}
}
