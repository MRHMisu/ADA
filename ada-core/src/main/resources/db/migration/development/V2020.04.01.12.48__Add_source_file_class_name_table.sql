CREATE TABLE SOURCE_FILE_CLASS_NAME
(
    source_file_id BIGINT  NOT NULL REFERENCES SOURCE_FILE (id),
    class_name     VARCHAR,
    UNIQUE (source_file_id, class_name)
)