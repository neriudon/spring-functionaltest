DROP TABLE IF EXISTS t_car;
DROP SEQUENCE IF EXISTS s_car;

CREATE SEQUENCE s_car;

CREATE TABLE t_car (
    car_id CHAR(10)
    ,name VARCHAR(60)
    ,color VARCHAR(60)
    ,release_date DATE
    ,CONSTRAINT pk_t_car PRIMARY KEY (car_id)
);
