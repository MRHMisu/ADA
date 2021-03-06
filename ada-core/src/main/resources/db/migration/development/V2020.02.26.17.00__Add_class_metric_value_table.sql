CREATE TABLE CLASS_METRIC_VALUE
(
    id                                              BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START 1) PRIMARY KEY,

    number_of_package_imports_incoming              FLOAT4 NOT NULL,
    number_of_package_imports_outgoing              FLOAT4 NOT NULL,
    number_of_attribute_invocation_incoming         FLOAT4 NOT NULL,
    number_of_attribute_invocation_outgoing         FLOAT4 NOT NULL,
    number_of_method_invocation_incoming            FLOAT4 NOT NULL,
    number_of_method_invocation_outgoing            FLOAT4 NOT NULL,
    number_of_constructor_invocation_incoming       FLOAT4 NOT NULL,
    number_of_constructor_invocation_outgoing       FLOAT4 NOT NULL,
    bidirectional_number_of_package_imports         FLOAT4 NOT NULL,
    bidirectional_number_of_attribute_invocations   FLOAT4 NOT NULL,
    bidirectional_number_of_method_invocations      FLOAT4 NOT NULL,
    bidirectional_number_of_constructor_invocations FLOAT4 NOT NULL
)