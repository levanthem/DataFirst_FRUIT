-- =============================================
-- data.sql
-- Sample data
-- =============================================

-- Category: 3 loại trái cây
INSERT INTO Category (name) VALUES
(N'Trái cây tươi'),
(N'Trái cây khô'),
(N'Trái cây nhập khẩu');

-- Fruits: Cầu Sung Dừa Đủ Xoài
INSERT INTO Fruit (name, description, price, expired_date, category_id) VALUES
(N'Cầu', N'Mãng cầu chín cây miền Tây', 32000, '2026-07-10', 1),
(N'Sung', N'Sung tươi trộn gỏi ăn kèm', 25000, '2026-07-11', 1),
(N'Dừa', N'Dừa Bến Tre ngọt mát', 20000, '2026-07-12', 1),
(N'Đủ', N'Đu đủ chín tự nhiên', 18000, '2026-07-13', 1),
(N'Xoài', N'Xoài cát Hòa Lộc', 45000, '2026-07-14', 1);

-- Category: 3 loại trái cây
INSERT INTO Account (email,password,role) VALUES
                                ('levanthem2002@gmail.com','Abcd@1234',1),
                                ('vohongngoc7777@gmail.com','Abcd@7890',2),
                                ('nguyenvanhung@gmail.com','Abcd@1234',3);