--BRAND_ENTITY
INSERT INTO BRAND_ENTITY (ID, NAME)
VALUES (1, 'Zara');

INSERT INTO BRAND_ENTITY (ID, NAME)
VALUES (2, 'Massimo Dutti');

INSERT INTO BRAND_ENTITY (ID, NAME)
VALUES (3, 'Bershka');

INSERT INTO BRAND_ENTITY (ID, NAME)
VALUES (4, 'Stradivarius');

--PRODUCT_ENTITY
INSERT INTO PRODUCT_ENTITY (ID, NAME)
VALUES (35455, 'Botas');

INSERT INTO PRODUCT_ENTITY (ID, NAME)
VALUES (35465, 'Chaqueta');

INSERT INTO PRODUCT_ENTITY (ID, NAME)
VALUES (35475, 'Pantalón');

INSERT INTO PRODUCT_ENTITY (ID, NAME)
VALUES (35485, 'Camisa');

--PRICES_ENTITY
INSERT INTO PRICES_ENTITY (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO PRICES_ENTITY (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO PRICES_ENTITY (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO PRICES_ENTITY (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');

--RATE_ENTITY
INSERT INTO RATE_ENTITY (priceList, name) 
VALUES (1, 'Tarifa estándar');
INSERT INTO RATE_ENTITY (priceList, name) 
VALUES (2, 'Tarifa premium');
INSERT INTO RATE_ENTITY (priceList, name) 
VALUES (3, 'Tarifa de descuento');
INSERT INTO RATE_ENTITY (priceList, name) 
VALUES (4, 'Tarifa especial');
