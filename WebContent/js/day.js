function getFristDay(){
 var date=new Date();
 date.setDate(1);
 return  date.getYear().toString()+addzero(date.getMonth()+1)+addzero(date.getDate());
}

function getLastDay(){
	 var date=new Date();
	 var currentMonth=date.getMonth();
	 var nextMonth=++currentMonth;
	 var nextMonthFirstDay=new Date(date.getFullYear(),nextMonth,1);
	 var oneDay=1000*60*60*24;
	 var day= new Date(nextMonthFirstDay-oneDay);
	 return  day.getYear().toString()+addzero(day.getMonth()+1)+addzero(day.getDate())
	}
function addzero(v) {if (v < 10) return '0' + v;return v.toString();}