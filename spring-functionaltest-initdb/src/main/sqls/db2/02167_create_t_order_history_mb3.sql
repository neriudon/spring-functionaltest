CREATE TABLE t_order_history_mb3 (
    id NUMERIC NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    order_id NUMERIC,
    biko VARCHAR(100),
    upd_time TIMESTAMP,
    CONSTRAINT t_order_dummy_mb3 PRIMARY KEY(id)
)
