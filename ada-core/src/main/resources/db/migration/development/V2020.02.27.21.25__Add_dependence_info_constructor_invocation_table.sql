CREATE TABLE DEPENDENCE_INFO_CONSTRUCTOR_INVOCATION
(
    dependence_info_id        BIGINT NOT NULL REFERENCES DEPENDENCE_INFO (id),
    constructor_invocation_id BIGINT NOT NULL REFERENCES CONSTRUCTOR_INVOCATION (id),
    UNIQUE (dependence_info_id, constructor_invocation_id)
)