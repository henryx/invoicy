/*
 * Copyright 2012 Enrico Bianchi <enrico.bianchi@ymail.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

CREATE TABLE customers(
    customer_id INTEGER,
    name VARCHAR(30),
    surname VARCHAR(30),
    address VARCHAR(500),
    city INTEGER,
    CONSTRAINT pk_customers PRIMARY KEY(customer_id)
);

CREATE TABLE customers_emails(
    customer_id INTEGER,
    email_address VARCHAR(80)
);