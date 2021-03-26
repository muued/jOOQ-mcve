CREATE DOMAIN domaints AS TIMESTAMP WITH TIME ZONE;

CREATE TABLE test (
  domaintsvalue domaints,
  localtsvalue TIMESTAMP WITH TIME ZONE
);
