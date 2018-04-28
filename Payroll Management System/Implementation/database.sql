


CREATE TABLE employee (
    Id varchar(50) primary key,
    Personnel_NO int,
    name varchar(100),
    CNIC varchar(50),
    Phone_NO varchar(50),
    scale int,
    pay int,
    jdate varchar(50),
    qualification varchar(100),
    designation varchar(100),
    monetization bool,
    accomodation bool,
    remaininghba int,
    incrementcount int,
    totalincrement int,
    Payslip boolean
);




CREATE TABLE empAllowances (
   
    name varchar(50),
    empid varchar(50),
    foreign key (empid) references employee(id),
    
    A01105_Qaul int,
    A01150_Others int,
    A01201_SPost int,
    A01202_HouseRent int,
    A01203_Conv int,
    A01217_Med int,
    A01224_Ent int, 
    A01228_Orderly int,
    A01236_Dep int,
    A01250_Incentive int,
    A01270_others int,
    A120X_Adhoc2010 int
    
   
);

insert into empallowances(empid) values(1);
select *from empAllowances



	CREATE TABLE empAllowancesCheck (
		empid varchar(50),
		foreign key (empid) references employee(id),
		A01105 boolean,
		A01150 boolean,
		A01201 boolean,
		A01202 boolean,
		A01203 boolean,
		A01217 boolean,
		A01224 boolean, 
		A01228 boolean,
		A01236 boolean,
		A01250 boolean,
		A01270 boolean,
		A120X boolean
	);








CREATE TABLE empDeduction (
    name varchar(50),
    EmpId varchar(50),
    foreign key (empid) references employee(id),
    GPfund int,
    BF int,
    GroupInsurance int,
    HouseRentDed int,
    HouseBuildingADV int,
    Driver int,
    Incometax int,
    Total int
    );
    
    CREATE TABLE empDeductionCheck (
    empid varchar(50),
    foreign key (empid) references employee(id),
    gpfund boolean,
    bf boolean,
    gi boolean,
    hrd boolean,
    hba boolean,
    driver boolean,
    incometax boolean
    );
    select * from empdeductioncheck
    
  CREATE TABLE  convHouseAllowance(
    scale int primary key,
    conveyance int ,
    houseRent int);
    insert into convHouseAllowance values(1,12,12);
    
CREATE TABLE payScaleChart (
	scale int primary key,
    basicpay int,
    increment int
    
    );
    
    
    CREATE TABLE allowanceInfo (
	head_ID varchar(50) primary key,
    head_name varchar(50)
);

   create table totals(
    empid varchar(50),
    foreign key (empid) references employee(id),
    TotalAllowance int,
    TotalDeduction int
);
   select * from allowanceinfo


insert into payroll.allowanceInfo values('A01105', 'Qualification Allowance');
insert into payroll.allowanceInfo values('A01150', 'Others-Special Pay');
insert into payroll.allowanceInfo values('A01201', 'Senior Post Allowance');
insert into payroll.allowanceInfo values('A01202', 'House Rent Allowance');
insert into payroll.allowanceInfo values('A01203', 'Conveyance Allowance');
insert into payroll.allowanceInfo values('A01217', 'Medical Allowance');
insert into payroll.allowanceInfo values('A01224', 'Entertainement Allowance');
insert into payroll.allowanceInfo values('A01228', 'Oderly Allowance');
insert into payroll.allowanceInfo values('A01236', 'Deputation Allowance');
insert into payroll.allowanceInfo values('A01250', 'Incentive Allowance');
insert into payroll.allowanceInfo values('A01270', 'Others');
insert into payroll.allowanceInfo values('A120X', 'Adhoc Allowance 2010');
insert into payroll.allowanceInfo values('A22', 'Adhoc Allowance 2010');
    
    
    

 
    
insert into payroll.payscalechart values(1,1000,10);
insert into payroll.payscalechart values(2,1000,10);
insert into payroll.payscalechart values(3,1000,10);
insert into payroll.payscalechart values(4,1000,10);




