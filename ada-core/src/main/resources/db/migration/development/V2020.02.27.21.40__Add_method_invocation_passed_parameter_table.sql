CREATE TABLE METHOD_INVOCATION_PASSED_PARAMETER
(
    method_invocation_id BIGINT NOT NULL REFERENCES METHOD_INVOCATION (id),
    passed_parameter_id       BIGINT NOT NULL REFERENCES PASSED_PARAMETER (id) UNIQUE
)