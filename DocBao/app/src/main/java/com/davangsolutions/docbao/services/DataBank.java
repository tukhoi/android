package com.davangsolutions.docbao.services;

import com.davangsolutions.docbao.models.Category;
import com.davangsolutions.docbao.models.Feed;
import com.davangsolutions.docbao.models.Publisher;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class DataBank {
    public static Map<UUID, Publisher> getPublishers()
    {
        Map<UUID, Publisher> map = new HashMap<UUID, Publisher>();
        List<Publisher> publishers = createPublishers();
        for (Publisher publisher: publishers)
            map.put(publisher.getId(), publisher);

        return map;
    }

    private static List<Publisher> createPublishers()
    {
        List<Publisher> publishers = new ArrayList<Publisher>();
        publishers.add(new Publisher(UUID.fromString("7429cc47-687f-4e78-9016-f96a502021c7"),
                "VnExpress", "vnexpress.net"));
        publishers.add(new Publisher(UUID.fromString("ddc17557-3e9c-4937-98fa-bc3c0e514bcd"),
                "Dân Trí", "dantri.com.vn"));
        publishers.add(new Publisher(UUID.fromString("ae68f542-48d6-4622-9419-1ee4461babf4"),
                "VietnamNet", "vietnamnet.vn"));
        publishers.add(new Publisher(UUID.fromString("51507882-9b60-4cf3-8523-2646366de8ee"),
                "Thanh Niên", "thanhnien.com.vn"));
        publishers.add(new Publisher(UUID.fromString("cac4a482-fb74-4ef6-8797-638cfb542f58"),
                "24h", "24h.com.vn"));
        publishers.add(new Publisher(UUID.fromString("e7ad6094-18fe-472f-b5da-7ba65164bb9c"),
                "Bóng Đá", "bongda.com.vn"));
        publishers.add(new Publisher(UUID.fromString("11d64201-5ef7-47d4-9dc9-aa26e4dee31b"),
                "Ngôi Sao", "ngoisao.net"));
        publishers.add(new Publisher(UUID.fromString("fc3af6b0-093e-4b06-b25d-82d85a7528d0"),
                "Thể thao Văn hóa", "thethaovanhoa.vn"));
        publishers.add(new Publisher(UUID.fromString("51f83702-07eb-4ea9-9d29-28c3b0b438ed"),
            "Kênh14", "kenh14.vn"));
        publishers.add(new Publisher(UUID.fromString("adf4c5a9-3791-4fc6-bf3f-18e563480492"),
                "Gia đình & Xã hội", "giadinh.net.vn"));
        publishers.add(new Publisher(UUID.fromString("9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494"),
                "Afamily", "afamily.vn"));
        publishers.add(new Publisher(UUID.fromString("6fb6a19c-74ac-45da-be34-323ab6403b27"),
                "Kiến thức ngày nay", "kienthucngaynay.info"));
        publishers.add(new Publisher(UUID.fromString("890d1e54-8298-4fc4-ba10-2c8b494245cb"),
                "CafeBiz", "cafebiz.vn"));
        publishers.add(new Publisher(UUID.fromString("074c83f9-2707-47d4-97ff-0de3985e92b3"),
                "CafeF", "cafef.vn"));
        publishers.add(new Publisher(UUID.fromString("b60df1ad-4a0d-48d2-bbaf-d328ef00067a"),
                "Đời sống & Pháp luật", "doisongphapluat.com"));
        publishers.add(new Publisher(UUID.fromString("59c5f421-6e68-4641-9d54-de145a4ae66f"),
                "Tinh tế", "tinhte.vn"));
        publishers.add(new Publisher(UUID.fromString("455b6156-77ba-4023-a057-9c06c7f60849"),
            "2sao", "2sao.vn"));
        publishers.add(new Publisher(UUID.fromString("7b420408-13bf-4340-81f7-a6430c538686"),
                "Tuổi trẻ", "tuoitre.vn"));
        publishers.add(new Publisher(UUID.fromString("67a3faf7-3ee4-4741-90f9-65713c37b261"),
                "Lao Động", "laodong.com.vn"));
        publishers.add(new Publisher(UUID.fromString("e200232a-7905-4d89-85a4-ef2f9e13be8a"),
                "YanTV", "yanner.yan.vn"));
        publishers.add(new Publisher(UUID.fromString("1a9e4947-acc4-4994-9d1f-c2d1a7515833"),
                "Zing News", "zing.vn"));
        publishers.add(new Publisher(UUID.fromString("4bf0a456-71b1-4bf2-9eea-1ffb65b4abbc"),
                "Link Hay", "linkhay.com"));
        publishers.add(new Publisher(UUID.fromString("9e31b411-d24c-40c5-b16f-23acff1c524b"),
                "Web Trẻ Thơ", "webtretho.com"));
        publishers.add(new Publisher(UUID.fromString("7c13fa56-c25e-42b5-8887-03c59dfacd0e"),
                "Người Lao Động", "nld.com.vn"));
        publishers.add(new Publisher(UUID.fromString("662d0f68-d2ff-4880-82dc-bb47fb1654de"),
                "Đài Tiếng nói Việt Nam", "vov.vn"));
        publishers.add(new Publisher(UUID.fromString("23896354-7b7f-4ab4-af21-1bbfe2f4f82f"),
                "Công An Nhân Dân", "cand.com.vn"));
        publishers.add(new Publisher(UUID.fromString("fcbc7304-612f-477c-af10-554d46abdffa"),
                "Quân Đội Nhân Dân", "qdnd.vn"));
        publishers.add(new Publisher(UUID.fromString("89a81534-4b8f-45aa-bb1a-4aab68a86f8d"),
                "Tiền Phong", "tienphong.vn"));
        publishers.add(new Publisher(UUID.fromString("3ffb9ef7-30a3-4a5e-b0cc-662bd514d23a"),
                "VTC News", "vtc.vn"));
        publishers.add(new Publisher(UUID.fromString("dbf1ab11-8b32-45f5-bf9b-5b037cb587e3"),
                "Đại đoàn kết", "daidoanket.vn"));
        publishers.add(new Publisher(UUID.fromString("f81f4939-d773-45ea-bac6-32f20c042b09"),
                "Hà Nội Mới", "hanoimoi.vn"));
        publishers.add(new Publisher(UUID.fromString("2ced4ee9-94f7-4a3d-adc9-e9caf6b47739"),
                "Việt Báo", "vietbao.vn"));
        publishers.add(new Publisher(UUID.fromString("2992a5db-fe37-4c24-8d19-53a41158b34c"),
                "VnMedia", "vnmedia.vn"));
        publishers.add(new Publisher(UUID.fromString("7d4df4df-0b29-409e-bb7d-05c107bcc292"),
                "Quách Đại Ca", "quachdaica.info"));
        publishers.add(new Publisher(UUID.fromString("f59e0e67-c2b9-490f-95b6-f763c61e445f"),
                "SoHa", "soha.vn"));

        return publishers;
    }

    private static List<Category> createCategories(final Map<UUID, Feed> feedMap) {
        List<Category> categories = new ArrayList<Category>();

        categories.add(new Category(
                UUID.fromString("339435fe-10f3-498c-bef1-6f967bfab7a9"),
                "tin mới",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("5b117b23-af7e-432f-829b-2211c3f4cda7")));
                        add(feedMap.get(UUID.fromString("fc74fccc-03c2-452f-86ca-50516e970afb")));   //dantri
                        add(feedMap.get(UUID.fromString("e0fab5b4-1636-44ce-9d4e-13a77d03b196")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("a947f475-b7c6-48ca-b279-a3127528702b")));   //thanhnien
                        add(feedMap.get(UUID.fromString("c16392f2-9918-4a2f-a6a3-7e0b1bf9c395")));   //24h
                        add(feedMap.get(UUID.fromString("48a3682e-9d96-4c16-90b3-de0d75d85a43")));   //kenh14
                        add(feedMap.get(UUID.fromString("3abdcd4f-46f4-4a21-bd30-f6671c1cd654")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("4d5827f7-504b-494b-9176-c3c5dd10cad8")));   //tuoitre
                        add(feedMap.get(UUID.fromString("9218f218-75dc-4237-8491-e2ce547ee7f7")));   //laodong
                        add(feedMap.get(UUID.fromString("7bbb39d1-49e3-4078-be50-695449a82340")));    //nguoilaodong
                    }
                }));


        categories.add(new Category(
                UUID.fromString("d8c2386a-0cc2-405e-9bf4-ba508e1ed29c"),
                "thế giới",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("18904d31-17bc-4547-bf3c-961239ed6280")));   //vnexpress
                        add(feedMap.get(UUID.fromString("2502b8ff-36e8-4f3a-93f3-b8c8c695debd")));   //dantri
                        add(feedMap.get(UUID.fromString("f4ce37c9-f70d-4cde-b137-54a0a17cfaf1")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("aea81c37-a685-462e-a4aa-bf20614507a0")));   //thanhnien
                        add(feedMap.get(UUID.fromString("c4dd69d9-d907-46a3-b7e7-625d2e7511c9")));   //thethaovanhoa
                        add(feedMap.get(UUID.fromString("1419928c-4ae6-42aa-92c2-a9e955f52a71")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("66a0c752-ab0d-4cbc-968a-76345f594627")));   //tuoitre
                        add(feedMap.get(UUID.fromString("0c6bb214-047d-451c-970e-1cc27a54b690")));   //laodong
                        //add(feedMap.get(UUID.fromString("493dc72b-5320-4457-b58b-7fc4255060a3")));   //nguoilaodong
                    }
                }));

        categories.add(new Category(
                UUID.fromString("617292b9-1580-4504-9cca-602de10ef02f"),
                "kinh tế",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("d129bd55-e322-4024-b36b-fe09a33eedd9")));   //vnexpress
                        add(feedMap.get(UUID.fromString("353b7e91-aa47-4975-b1e1-db2b128ef5d8")));   //dantri
                        add(feedMap.get(UUID.fromString("177c6821-b002-4b3c-8e06-feaacbb5bdb4")));   //dantri
                        add(feedMap.get(UUID.fromString("96c697c5-1d31-485c-8204-b94a224f1469")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("b4bfed8d-8692-438b-ae4d-713024738240")));   //thanhnien
                        add(feedMap.get(UUID.fromString("bd50d029-1190-4aee-941a-c1f8631f63ab")));   //24h
                        add(feedMap.get(UUID.fromString("b84dd60e-d9d4-4be4-8806-434b91872981")));   //cafef
                        add(feedMap.get(UUID.fromString("3ed827a1-3dc9-48d9-b8bf-320b9bfa9902")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("c370f95b-6c4c-4200-b105-15186cffc92c")));   //tuoitre
                        add(feedMap.get(UUID.fromString("ddc4edf8-de1c-4a32-a05c-d9c4c3987229")));   //laodong
                        //add(feedMap.get(UUID.fromString("e75f5d05-f00d-4db7-9ad5-1f0389d96c02")));   //nguoilaodong
                    }
                }));
        categories.add(new Category(
                UUID.fromString("c96e3b84-795c-490e-94bc-f6813ac75eb1"),
                "xã hội",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("c8420b6a-afa0-4f6e-a616-fcf03379359d")));   //vnexpress
                        add(feedMap.get(UUID.fromString("9f9b125f-8fc3-4607-9ef4-b53c67764e04")));   //dantri
                        add(feedMap.get(UUID.fromString("4d883ba0-c34e-4e0c-a06b-249f1b5f4621")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("35a4eb83-2130-4d71-b937-e054e06999b9")));   //thanhnien
                        add(feedMap.get(UUID.fromString("7d9fd604-311b-42b7-a6e7-708d106c2577")));   //thethaovanhoa
                        add(feedMap.get(UUID.fromString("03e99378-97c1-4e64-a282-8dd1c0e76df2")));   //giadinh
                        add(feedMap.get(UUID.fromString("bc3384d7-5e2d-42ff-b286-f9c3ea8eb61e")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("1bd4cfed-dd5d-42a2-8a2d-86af12db00cd")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("122c60e4-2e09-40bc-bb9a-08b83b51df37")));   //laodong
                        //add(feedMap.get(UUID.fromString("681c25eb-b614-4b4e-8197-d79df14b0597")));   //nguoilaodong
                    }
                }));
        categories.add(new Category(
                UUID.fromString("e11f75f5-5f91-494d-a1a5-a3ad354e28dc"),
                "thể thao",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("e559f4cf-067c-4d08-98ed-5d897050972f")));   //vnexpress
                        add(feedMap.get(UUID.fromString("ab7cd32e-d2e4-4f50-8768-594781acde8c")));   //dantri
                        add(feedMap.get(UUID.fromString("3b85f3e2-84fe-48a4-a4b2-6f92dd368636")));   //24h
                        add(feedMap.get(UUID.fromString("6faa6131-9fe3-41ee-9340-9432cddd6086")));   //24h
                        add(feedMap.get(UUID.fromString("096bc270-6029-403f-a375-39c00ca10d8e")));   //ngoisao
                        add(feedMap.get(UUID.fromString("83c959fd-9440-4210-90e1-4bce75228121")));   //thehthaovanhoa
                        add(feedMap.get(UUID.fromString("8dd3153c-5ed1-414f-aca7-d2acd0615dc6")));   //bongda
                        add(feedMap.get(UUID.fromString("8d7cc1c4-0526-4b25-9b6e-a6cf5d65183b")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("c4610f84-1223-44d1-a7a7-fad6a804793f")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("3e49146c-6adb-4fcc-be10-9b2a2d6a0e65")));   //laodong
                        //add(feedMap.get(UUID.fromString("efb3dae7-ace1-4f02-ae38-f891f1abdde9")));   //nguoilaodong
                    }
                }));
        categories.add(new Category(
                UUID.fromString("06a1bc28-70f2-42d0-b6d2-5a3e59df667c"),
                "văn hóa",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("557c322c-069d-4528-89e9-3792517fcbca")));   //dantri
                        add(feedMap.get(UUID.fromString("6dad63e2-c66a-4eed-aafa-d7e6dd374897")));   //dantri
                        add(feedMap.get(UUID.fromString("b5ffcf9d-b0d2-4bde-8a68-f5e41c50e570")));   //dantri
                        add(feedMap.get(UUID.fromString("b3dfff0d-80b3-4473-a301-45e8914906ad")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("8b658067-0b5e-45ed-8e99-e0d1c16af0d9")));   //thanhnien
                        add(feedMap.get(UUID.fromString("0cf76bce-bebe-4ce8-9214-ff590fdf8dcc")));   //thanhnien
                        add(feedMap.get(UUID.fromString("f2ced884-4028-4a75-b05d-281bca0a6e1e")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("afb7443b-8a5e-4e82-975a-414372c6ecf9")));   //tuoitre
                        add(feedMap.get(UUID.fromString("c0788969-450e-43af-ac02-b49eab460651")));   //tuoitre
                        add(feedMap.get(UUID.fromString("4f3c232e-e1de-456f-9fa1-0932c674fd0d")));   //laodong
                        //add(feedMap.get(UUID.fromString("7792d26c-3857-47bf-920c-0e58f8f74dc6")));   //nguoilaodong
                    }
                }));
        categories.add(new Category(
                UUID.fromString("9bd602ef-6100-4be4-9a79-733c6fa5a872"),
                "giải trí",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("dddff8c4-54ad-4a38-b016-144a004c967f")));   //vnexpress
                        add(feedMap.get(UUID.fromString("6fae8c71-5103-4af7-b2ec-66b8f64797e6")));   //dantri
                        add(feedMap.get(UUID.fromString("dafc4806-9c62-4d6b-8608-427ae6be6551")));   //dantri
                        add(feedMap.get(UUID.fromString("4c35e67e-1ff5-48d3-a5a0-41a4148dc226")));   //dantri
                        add(feedMap.get(UUID.fromString("e5dfa40c-55d4-4fa5-b79d-9d6629faed0e")));   //dantri
                        add(feedMap.get(UUID.fromString("a4187888-dae1-4bf3-85fc-06d8e22fe076")));   //thanhnien
                        add(feedMap.get(UUID.fromString("a6229ccb-b035-4554-ac4a-f97a98110a44")));   //thanhnien
                        add(feedMap.get(UUID.fromString("e74d9400-2a8e-4fc0-a185-06499516de57")));   //24h
                        add(feedMap.get(UUID.fromString("94ebc489-93a7-431b-8f49-3222e5f8230f")));   //24h
                        add(feedMap.get(UUID.fromString("0ed5c415-ea7d-471e-b37c-2371fe03df93")));   //ngoisao
                        add(feedMap.get(UUID.fromString("ad74eee0-631b-44b1-a7ad-274e78c0d576")));   //ngoisao
                        add(feedMap.get(UUID.fromString("7978c6dc-57a2-4d60-bca8-a24e49a12e9b")));   //afamily
                        add(feedMap.get(UUID.fromString("da839813-900c-4705-9395-d451161170f8")));   //afamily
                        add(feedMap.get(UUID.fromString("38d177fc-6e5c-4c64-b6b7-59eae5fa4ff4")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("09df6e4c-da83-4019-a574-e9d167435f79")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("7a2fcf1d-e359-497b-ae86-4ec80d3bf853")));   //2sao
                        add(feedMap.get(UUID.fromString("29f4b0a9-cd49-4c58-a43b-a8efb6096cc9")));   //2sao
                        add(feedMap.get(UUID.fromString("896ad11e-1db6-42ea-9afe-67456f92eb88")));   //2sao
                        add(feedMap.get(UUID.fromString("36221c2e-323a-4fa7-8c0a-efc197cc2b14")));   //2sao
                    }
                }));
        categories.add(new Category(
                UUID.fromString("5ef0fae5-8dee-4715-a9f1-68df5d698847"),
                "khoa học công nghệ",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("e7977f23-e798-417a-99ac-7fc561026eeb")));   //vnexpress
                        add(feedMap.get(UUID.fromString("3b0b1801-d743-4191-b38d-417ce9bedd27")));   //vnexpress
                        add(feedMap.get(UUID.fromString("c6d83f98-deec-4865-ba0a-69b15b539a3b")));   //dantri
                        add(feedMap.get(UUID.fromString("f1b00803-2be2-4a6e-84aa-cde86f64622d")));   //dantri
                        add(feedMap.get(UUID.fromString("615f0f59-bad5-4045-84b6-828e12bbac7f")));   //dantri
                        add(feedMap.get(UUID.fromString("1eed0e7b-0793-4e28-918f-0811e1c7f135")));   //vietnamnet
                        add(feedMap.get(UUID.fromString("370d600e-02bd-4c78-85f3-ffb926d31ea8")));   //thanhnien
                        add(feedMap.get(UUID.fromString("5b73c2a5-90e5-4a3e-8800-3143f6d8d891")));   //thanhnien
                        add(feedMap.get(UUID.fromString("a0f08840-0859-44cc-bdea-9f0349a71495")));   //24h
                        add(feedMap.get(UUID.fromString("04aebaee-be2c-46c8-ad4e-6041041d9736")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("a417c78c-6d53-4d46-9658-bd9aa520e6e7")));   //2sao
                        add(feedMap.get(UUID.fromString("1d44c727-d875-45fe-87b4-457870584791")));   //laodong
                        //add(feedMap.get(UUID.fromString("c19c977d-7e2a-4bdd-a02a-955a71515ca7")));   //nguoilaodong
                    }
                }));
        categories.add(new Category(
                UUID.fromString("16e79392-19a1-4f7c-a72f-620a123e8e9d"),
                "ôtô xe máy",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("6a6bbc3b-5c15-4053-9b06-0506c3ba5084")));   //vnexpress
                        add(feedMap.get(UUID.fromString("21c78310-489f-419b-9c4a-d83bd1e30b45")));   //dantri
                        add(feedMap.get(UUID.fromString("fe8558e2-2b35-4409-926a-88d1974af799")));   //dantri
                        add(feedMap.get(UUID.fromString("2df0caf8-cad6-46af-9901-ceee77e67784")));   //dantri
                        add(feedMap.get(UUID.fromString("be9be699-75cb-4838-afcf-be34245e97d1")));   //dantri
                        add(feedMap.get(UUID.fromString("3e3a717a-ef3c-46a1-8a3b-7359a4be95b5")));   //dantri
                        add(feedMap.get(UUID.fromString("3aed472f-62d9-41ff-af35-df0428450edc")));   //dantri
                        add(feedMap.get(UUID.fromString("632c4584-ff9e-49c9-8236-fafa6822f3c9")));   //24h
                        add(feedMap.get(UUID.fromString("c52566e5-f97a-4994-ae2d-0a3f02e5987d")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("2ec0816b-90f7-4e40-a20a-0a07772a7230")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("b9180784-6144-485c-9e62-74d3011ac446")));   //doisongphapluat
                        add(feedMap.get(UUID.fromString("bb8ad746-2032-45f6-b08d-ab483b8a9161")));   //tuoitre
                    }
                }));
        categories.add(new Category(
                UUID.fromString("d2c5285a-9594-44b7-9a75-35770cc9633e"),
                "cười",
                new ArrayList<Feed>() {
                    {
                        add(feedMap.get(UUID.fromString("86dc31e7-721c-411c-8a0f-108094d5dcd7")));   //vnexpress
                        add(feedMap.get(UUID.fromString("298a3314-00a0-4550-982d-93ab3c5c227e")));   //thanhnien
                        //add(feedMap.get(UUID.fromString("f46b4627-8418-47f4-9372-8b4e2daec3d5")));   //haivl
                        add(feedMap.get(UUID.fromString("24340dc3-a088-4f4c-99f8-8d82f1ac5d19")));   //24h
                        add(feedMap.get(UUID.fromString("c60422cb-8ca4-480e-87c8-acd080d7a208")));   //ngoisao
                        add(feedMap.get(UUID.fromString("db54bfb3-ff6a-41dd-9eca-30b8c487cd47")));   //thethaovanhoa
                        add(feedMap.get(UUID.fromString("a67c7e4e-0e51-460e-be66-e5e31439684e")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("ba9c4c47-7773-441e-8209-5f8079e4af3c")));   //kienthucngaynay
                        add(feedMap.get(UUID.fromString("38b33a74-0619-4626-98b6-ffd25a54ecb3")));   //doisongphapluat
                    }
                }));

        return categories;
    }

    private static List<Feed> createFees(final Map<UUID, Publisher> publisherMap)
    {
        List<Feed> feeds = new ArrayList<Feed>();



        5b117b23-af7e-432f-829b-2211c3f4cda7, 7429cc47-687f-4e78-9016-f96a502021c7, Trang chủ, http://vnexpress.net/rss/tin-moi-nhat.rss, 1, 1
        c8420b6a-afa0-4f6e-a616-fcf03379359d, 7429cc47-687f-4e78-9016-f96a502021c7, Thời sự, http://vnexpress.net/rss/thoi-su.rss, 1, 1
        18904d31-17bc-4547-bf3c-961239ed6280, 7429cc47-687f-4e78-9016-f96a502021c7, Thế giới, http://vnexpress.net/rss/the-gioi.rss, 1, 1
        d129bd55-e322-4024-b36b-fe09a33eedd9, 7429cc47-687f-4e78-9016-f96a502021c7, Kinh doanh, http://vnexpress.net/rss/kinh-doanh.rss, 1, 0
        dddff8c4-54ad-4a38-b016-144a004c967f, 7429cc47-687f-4e78-9016-f96a502021c7, Giải trí, http://vnexpress.net/rss/giai-tri.rss, 1,0
        e559f4cf-067c-4d08-98ed-5d897050972f, 7429cc47-687f-4e78-9016-f96a502021c7, Thể thao, http://thethao.vnexpress.net/rss/tin-moi-nhat.rss, 1, 1
        ba9f314e-e47b-401a-b139-49c5f9b2a3c0, 7429cc47-687f-4e78-9016-f96a502021c7, Pháp luật, http://vnexpress.net/rss/phap-luat.rss, 1, 0
        39e020a5-a8ac-4799-b8bb-1ec0e7c7f669, 7429cc47-687f-4e78-9016-f96a502021c7, Du lịch, http://vnexpress.net/rss/du-lich.rss, 1, 0
        36095aee-50a7-4650-bea5-1f46fbbbc476, 7429cc47-687f-4e78-9016-f96a502021c7, Đời sống, http://vnexpress.net/rss/doi-song.rss, 1, 0
        e7977f23-e798-417a-99ac-7fc561026eeb, 7429cc47-687f-4e78-9016-f96a502021c7, Khoa học, http://vnexpress.net/rss/khoa-hoc.rss, 1,0
        3b0b1801-d743-4191-b38d-417ce9bedd27, 7429cc47-687f-4e78-9016-f96a502021c7, Số hóa, http://vnexpress.net/rss/so-hoa.rss, 1, 1
        6a6bbc3b-5c15-4053-9b06-0506c3ba5084, 7429cc47-687f-4e78-9016-f96a502021c7, Ôtô - Xe máy, http://vnexpress.net/rss/oto-xe-may.rss, 1, 0
        1246be46-a22f-4994-9ade-45d9726295ee, 7429cc47-687f-4e78-9016-f96a502021c7, Cộng đồng, http://vnexpress.net/rss/cong-dong.rss, 1, 0
        fa7c56c8-5174-4c82-a87e-ba86cace0428, 7429cc47-687f-4e78-9016-f96a502021c7, Tâm sự, http://vnexpress.net/rss/tam-su.rss, 1, 0
        86dc31e7-721c-411c-8a0f-108094d5dcd7, 7429cc47-687f-4e78-9016-f96a502021c7, Cười, http://vnexpress.net/rss/cuoi.rss, 1, 1
        fc74fccc-03c2-452f-86ca-50516e970afb, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Trang chủ, http://dantri.com.vn/trangchu.rss, 1, 1
        9f9b125f-8fc3-4607-9ef4-b53c67764e04, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội, http://dantri.com.vn/xa-hoi.rss, 1, 0
        33ae6558-be2b-4cf8-a77d-d00b7ae09bc2, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội - Chính trị, http://dantri.com.vn/chinh-tri.rss, 1,0
        85d0ab60-3d92-4fa7-8236-33e52452f546, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội - Đời sống, http://dantri.com.vn/doi-song.rss, 1,0
        dad40917-2dac-401a-9ed7-85198b2afbe3, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội - Phóng sự - ký sự, http://dantri.com.vn/phong-suky-su.rss, 1,0
        516bf47d-3e3d-4507-91f8-1c8ad4ecbcdf, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội - Giao thông, http://dantri.com.vn/giao-thong.rss, 1,0
        ce48e048-ba9e-4657-95cd-7f1753aeb3e3, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Xã hội - Môi trường, http://dantri.com.vn/moi-truong.rss, 1, 0
        2502b8ff-36e8-4f3a-93f3-b8c8c695debd, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Thế giới, http://dantri.com.vn/Thegioi.rss, 1,1
        9c23fd63-db89-41ae-9f5c-effde7ab7785, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Thế giới - Đông Á, http://dantri.com.vn/dong-a.rss, 1,0
        8e987c60-5e25-4602-a1e7-6043fb9e2beb, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, EU & Nga, http://dantri.com.vn/eu--nga.rss, 1,0
        9ca3558f-fc61-4090-8896-de60aea96093, ddc17557-3e9c-4937-98fa-bc3c0e514bcd, Châu Mỹ ,http://www.dantri.com.vn/chau-my.rss, 1, 0
        c3090858-92d2-45d0-ae8c-b6d44f00cc87,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Điểm nóng,http://www.dantri.com.vn/diem-nong.rss, 1,0
        e79fb3b7-58bb-402a-a78e-8b051b93efec,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Kiều bào,http://www.dantri.com.vn/kieu-bao.rss, 1,0
        4be63473-17f7-4164-8490-9666d5618d51,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tết Việt xa xứ,http://www.dantri.com.vn/tet-viet-xa-xu.rss, 1,0
        ab7cd32e-d2e4-4f50-8768-594781acde8c,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thể thao,http://www.dantri.com.vn/The-Thao.rss, 1,1
        fdd78cc9-f0b2-4fec-9204-83da8d841326,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thể thao trong nước,http://www.dantri.com.vn/the-thao-trong-nuoc.rss, 1,0
        52d71ab8-0448-4bbd-b0f0-1e1fe37d80bb,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thể thao quốc tế,http://www.dantri.com.vn/the-thao-quoc-te.rss, 1,0
        89d73ab4-3e41-49c4-b980-d8f75ddb121c,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bóng đá trong nước,http://www.dantri.com.vn/bong-da-trong-nuoc.rss, 1,0
        67212e10-7ed2-4b97-bf71-bcf83f36cb99,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bóng đá châu Âu,http://www.dantri.com.vn/bong-da-chau-au.rss, 1,0
        bed69d55-3ccf-4bf3-97f8-786aef9f7b2e,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bóng đá Anh,http://www.dantri.com.vn/bong-da-anh.rss, 1,0
        33ef96cc-dfe6-4d4d-8038-c9255e6664c6,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bóng đá TBN,http://www.dantri.com.vn/bong-da-tbn.rss, 1,0
        91ee9931-26db-409c-917e-bf9fafe8fb17,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tennis,http://www.dantri.com.vn/tennis.rss, 1, 0
        2f9ec93d-892a-41ae-8a59-e7521e6e04c4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Giáo dục - Khuyến học,http://www.dantri.com.vn/giaoduc-khuyenhoc.rss, 1,0
        7527af49-70de-46c2-8482-d2b67e7f34d2,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tin tuyển sinh,http://www.dantri.com.vn/tin-tuyen-sinh.rss, 1,0
        6ca3e3c6-5f88-4d4e-8aaa-db8a2dc31dc4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Khoa học,http://www.dantri.com.vn/khoa-hoc.rss, 1,0
        8449b3ea-102d-41d1-8611-cdc6f2a62e8f,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Khuyến học,http://www.dantri.com.vn/khuyen-hoc.rss, 1,0
        bac6c2a7-a664-45b2-94e5-868aecd8e3cf,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Gương sáng,http://www.dantri.com.vn/guong-sang.rss, 1,0
        c143239e-2ebf-456a-ae42-0cd70bb789d7,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nhân tài Đất Việt,http://www.dantri.com.vn/nhan-tai-dat-viet.rss, 1,0
        9e6e974d-636e-430d-bd5f-9e61e79d439a,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Apollo Vlog,http://www.dantri.com.vn/apollo-vlog.rss, 1,0
        41a1d07b-4486-4c24-9e53-a8126212eff2,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nghề hot,http://www.dantri.com.vn/nghe-hot.rss, 1,0
        b9aaf0ba-3e3a-4403-9e75-c20e2fbf9770,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tấm lòng nhân ái,http://www.dantri.com.vn/tamlongnhanai.rss, 1,0
        09f16035-5ef9-4202-aa81-52fcfb6e553e,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Danh sách ủng hộ,http://www.dantri.com.vn/danh-sach-ung-ho.rss, 1,0
        0e6b0d2f-c712-4926-b689-a54bd91e3a0f,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Danh sách kết chuyển,http://www.dantri.com.vn/danh-sach-ket-chuyen.rss, 1,0
        d05e21a1-88f5-4fb0-92e2-67b66da78904,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Hoàn cảnh,http://www.dantri.com.vn/hoan-canh.rss, 1,0
        353b7e91-aa47-4975-b1e1-db2b128ef5d8,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Kinh doanh,http://www.dantri.com.vn/kinhdoanh.rss, 1,0
        177c6821-b002-4b3c-8e06-feaacbb5bdb4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tài chính - Đầu tư,http://www.dantri.com.vn/tai-chinh-dau-tu.rss, 1,0
        a72b21eb-4fcc-4401-847e-f2993a5d36d9,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thị trường,http://www.dantri.com.vn/thi-truong.rss, 1,0
        fa64edce-67ca-4558-b3f4-3ba518084e11,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Doanh nghiệp,http://www.dantri.com.vn/doanh-nghiep.rss, 1,0
        a48e2dd5-411e-474b-81b5-319f14c93767,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bảo vệ NTD,http://www.dantri.com.vn/bao-ve-ntd.rss, 1, 0
        7b4351d7-941d-40b8-ad62-6d59482d046a,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Quốc tế,http://www.dantri.com.vn/quoc-te.rss, 1, 0
        e3416c11-f305-444e-9c5c-ff1ef09212b6,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nhà đất,http://www.dantri.com.vn/nha-dat.rss, 1, 0
        9bfcb943-7859-4335-8137-94230114e2f3,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nghề nghiệp,http://www.dantri.com.vn/nghe-nghiep.rss, 1, 0
        b5ffcf9d-b0d2-4bde-8a68-f5e41c50e570,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Văn hóa,http://www.dantri.com.vn/van-hoa.rss, 1, 1
        354ebc6e-970c-441c-9521-4b6e625fe644,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Đời sống văn hóa,http://www.dantri.com.vn/doi-song-van-hoa.rss, 1, 0
        98835d26-0eb1-48f7-a800-cfc464929c7d,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Sân khấu - Dân gian,http://www.dantri.com.vn/san-khau-dan-gian.rss, 1, 0
        6c896285-5b77-4b49-97f9-f7cd6f8d7dae,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Du lịch - Khám phá,http://www.dantri.com.vn/du-lich-kham-pha.rss, 1, 0
        7ee30f99-5448-4e34-ab26-25da81ac2919,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Văn học,http://www.dantri.com.vn/van-hoc.rss, 1, 0
        557c322c-069d-4528-89e9-3792517fcbca,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Điện ảnh,http://www.dantri.com.vn/dien-anh.rss, 1, 1
        6dad63e2-c66a-4eed-aafa-d7e6dd374897,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Âm nhạc,http://www.dantri.com.vn/am-nhac.rss, 1, 1
        6fae8c71-5103-4af7-b2ec-66b8f64797e6,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Giải trí,http://www.dantri.com.vn/giaitri.rss, 1, 1
        dafc4806-9c62-4d6b-8608-427ae6be6551,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Sao Việt,http://www.dantri.com.vn/sao-viet.rss, 1, 1
        4c35e67e-1ff5-48d3-a5a0-41a4148dc226,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Hollywood,http://www.dantri.com.vn/hollywood.rss, 1, 0
        c854e07a-a11d-49d4-9cd2-8223c99ef6d6,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Châu Á,http://www.dantri.com.vn/chau-a.rss, 1, 0
        e5dfa40c-55d4-4fa5-b79d-9d6629faed0e,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thời trang,http://www.dantri.com.vn/thoi-trang.rss, 1, 0
        428e0ecd-f197-4f69-9d9a-1659982b666a,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Xem - Ăn - Chơi,http://www.dantri.com.vn/xem-an-choi.rss, 1, 0
        a229a720-19ce-433c-bd43-7925dc96befa,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Pháp luật,http://www.dantri.com.vn/skphapluat.rss, 1, 0
        18bfdcb9-4379-4457-a992-279c3fe90f24,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nhịp sống trẻ,http://www.dantri.com.vn/nhipsongtre.rss, 1, 0
        1ea5c726-5713-40d2-9e70-fb777b3cd3de,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Người Việt trẻ,http://www.dantri.com.vn/nguoi-viet-tre.rss, 1, 0
        254834b5-8d1a-4662-891c-8b2b0a92e416,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Phóng sự trẻ,http://www.dantri.com.vn/phong-su-tre.rss, 1, 0
        64f9fa01-efdd-4f67-aad1-43395b28bf7f,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,BUV Challenge,http://www.dantri.com.vn/buv-challenge.rss, 1, 0
        682462fe-2392-4cae-9e56-310076d80ae5,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,English Champion,http://www.dantri.com.vn/english-champion.rss, 1, 0
        5412cce3-12d7-46fd-956c-5f961275b4c4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tình yêu - Giới tính,http://www.dantri.com.vn/tinhyeu-gioitinh.rss, 1, 0
        2fd030c3-53d8-4fae-9e2c-aed47bc0408e,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tình yêu,http://www.dantri.com.vn/tinh-yeu.rss, 1, 0
        c5045110-27ba-44fa-ad00-ad83c1c2ea9c,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Gia đình,http://www.dantri.com.vn/gia-dinh.rss, 1, 0
        14416714-86c3-4b14-9641-5c375c012e54,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Góc tâm hồn,http://www.dantri.com.vn/goc-tam-hon.rss, 1, 0
        c83395ae-61ef-45a8-a3d3-6c16abdcf067,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Sức khỏe,http://www.dantri.com.vn/suckhoe.rss, 1, 0
        ca883e23-0596-4d2e-8041-19ce7cea34f2,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Kiến thức giới tính,http://www.dantri.com.vn/kien-thuc-gioi-tinh.rss, 1, 0
        e67ac2a2-c440-4194-9e79-3cac2c211dbd,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn,http://www.dantri.com.vn/tu-van.rss, 1, 0
        5cb40f91-911e-4a24-b33a-963bc0e7f72b,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Làm đẹp,http://www.dantri.com.vn/lam-dep.rss, 1, 0
        c6d83f98-deec-4865-ba0a-69b15b539a3b,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Sức mạnh số,http://www.dantri.com.vn/cong-nghe.rss, 1, 1
        f1b00803-2be2-4a6e-84aa-cde86f64622d,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Vi tính,http://www.dantri.com.vn/vi-tinh.rss, 1, 1
        615f0f59-bad5-4045-84b6-828e12bbac7f,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Điện thoại,http://www.dantri.com.vn/dien-thoai.rss, 1, 0
        26deb298-d798-429a-b201-0e6bd9fb5a2a,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thủ thuật,http://www.dantri.com.vn/thu-thuat.rss, 1, 0
        bc356424-8cbe-41b5-94fd-66d05eb6ddd9,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn,http://www.dantri.com.vn/tu-van-so.rss, 1, 0
        508c50a9-249d-40ad-80a5-d2aca1081f63,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Nghe nhìn,http://www.dantri.com.vn/nghe-nhin.rss, 1, 0
        21c78310-489f-419b-9c4a-d83bd1e30b45,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Ô tô - Xe máy,http://www.dantri.com.vn/otoxemay.rss, 1, 0
        fe8558e2-2b35-4409-926a-88d1974af799,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Thị trường xe,http://www.dantri.com.vn/thi-truong-xe.rss, 1, 0
        2df0caf8-cad6-46af-9901-ceee77e67784,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Văn hoá xe,http://www.dantri.com.vn/van-hoa-xe.rss, 1, 0
        be9be699-75cb-4838-afcf-be34245e97d1,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn xe,http://www.dantri.com.vn/tu-van-xe.rss, 1, 0
        3e3a717a-ef3c-46a1-8a3b-7359a4be95b5,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Đua xe,http://www.dantri.com.vn/dua-xe.rss, 1, 0
        3aed472f-62d9-41ff-af35-df0428450edc,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Giá xe,http://www.dantri.com.vn/gia-xe.rss, 1, 0
        ac6a1f62-23f2-414e-aa15-f61a5d16d8a1,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Bạn đọc,http://www.dantri.com.vn/diendan-bandoc.rss, 1, 0
        6e9346ea-24d4-412d-8d66-5f73bee72075,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn pháp luật,http://www.dantri.com.vn/tu-van-phap-luat.rss, 1, 0
        039431ff-0590-49de-86a2-c993b797f2ce,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Hồi âm,http://www.dantri.com.vn/hoi-am.rss, 1, 0
        08b29f4e-9367-4a92-a418-a205b7876dd0,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Góc ảnh,http://www.dantri.com.vn/goc-anh.rss, 1, 0
        8e34fe26-0b51-4e00-80b9-1a6aa47e6b1a,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Diễn đàn,http://www.dantri.com.vn/dien-dan.rss, 1, 0
        9e3180f0-b512-4b80-8918-794259948eac,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Giáo dục,http://www.dantri.com.vn/giao-duc.rss, 1, 0
        bfbbdf38-239a-4947-9620-c90a81e3c3ed,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Xã hội,http://www.dantri.com.vn/xa-hoi.rss, 1, 0
        b6d62a8d-ab74-415e-8a8a-ec8ae6f0ab97,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Du Lịch,http://www.dantri.com.vn/du-lich.rss, 1, 0
        af75035c-8168-4b86-a862-96c897d57974,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Vòng quay du lịch,http://www.dantri.com.vn/vong-quay-du-lich.rss, 1, 0
        4216fa45-847a-4d5b-a13d-9873f7ed8398,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Khám phá,http://www.dantri.com.vn/kham-pha.rss, 1, 0
        69960b93-2ee7-45a9-a23a-2ace908b06f4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Lễ hội bốn phương,http://www.dantri.com.vn/le-hoi-bon-phuong.rss, 1, 0
        dd6df0c5-d3ac-4c49-89b2-c7b1f4b03dfa,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Món ngon - Điểm đẹp,http://www.dantri.com.vn/mon-ngon-diem-dep.rss, 1, 0
        c6b12c29-631d-411c-bd02-bf9bd0d6a462,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn - Chia sẻ,http://www.dantri.com.vn/tu-van-chia-se.rss, 1, 0
        de705dde-210f-42e2-b44d-b4dfa7362a28,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tour hay - Khuyến mại,http://www.dantri.com.vn/tour-hay-khuyen-mai.rss, 1, 0
        8ce856cd-f525-47ba-8893-376c12d301bb,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Video - Ảnh,http://www.dantri.com.vn/video-anh.rss, 1, 0
        c6e0d9d7-3899-465c-b115-ad5f5b1f85a0,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Điểm đến mỗi tuần,http://www.dantri.com.vn/diem-den-moi-tuan.rss, 1, 0
        c0f90e09-39d7-4d01-b305-8b9f34e466d1,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Chuyện lạ,http://www.dantri.com.vn/chuyen-la.rss, 1, 0
        576e904a-9963-42c6-ad01-492a49c872a3,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tuyển sinh,http://www.dantri.com.vn/tuyen-sinh.rss, 1, 0
        3d0709d9-8096-487f-87ae-8a7210d756ab,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Chỉ tiêu,http://www.dantri.com.vn/chi-tieu.rss, 1, 0
        666efaaf-d991-42c6-89a8-0e048c4edc09,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Kinh nghiệm,http://www.dantri.com.vn/kinh-nghiem.rss, 1, 0
        5c3b5699-11c2-4a93-94b6-2dab4b354889,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Đề thi - Đáp án,http://www.dantri.com.vn/de-thi-dap-an.rss, 1, 0
        37e178e3-9d79-47d3-b576-a3795533951d,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Khoảnh khắc mùa thi,http://www.dantri.com.vn/khoanh-khac-mua-thi.rss, 1, 0
        ebfc4f35-3a18-4e31-96ea-c5bdb3d5753c,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Gặp gỡ các trường,http://www.dantri.com.vn/gap-go-cac-truong.rss, 1, 0
        7ded129c-4918-47d2-892a-65b31be12683,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tư vấn toàn cảnh,http://www.dantri.com.vn/tu-van-toan-canh.rss, 1, 0
        e9373cc1-caca-4e25-9faa-05f20146bff9,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Lưu ý,http://www.dantri.com.vn/luu-y.rss, 1, 0
        4c8187d9-28d8-4190-9ef9-e9f2bbb81ee4,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Du học,http://www.dantri.com.vn/du-hoc.rss, 1, 0
        ae30a4c3-8b30-4e5a-9ce9-948727973a16,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Talk 2 Language Link,http://www.dantri.com.vn/talk-2-language-link.rss, 1, 0
        4e6e9448-d1f7-4ec0-9770-f16b0e63da38,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tài trí Việt,http://www.dantri.com.vn/tai-tri-viet.rss, 1, 0
        6ad2cb1c-c8e8-4af8-9a51-12b35003f0ca,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Cẩm nang - Hỏi đáp,http://www.dantri.com.vn/cam-nang-hoi-dap.rss, 1, 0
        efc2797f-1d15-477b-a38a-b206b402c89b,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Talk 2 uni,http://www.dantri.com.vn/talk-2-uni.rss, 1, 0
        90213315-f800-429d-8baa-c3a6c307d39b,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Talk to Paul,http://www.dantri.com.vn/talk-to-paul.rss, 1, 0
        d441d53f-6050-4bb1-a3a0-0af1f61b1783,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Biết +,http://www.dantri.com.vn/biet-.rss, 1, 0
        be8c1971-c59f-4a87-b37a-1b42defbefb3,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Blog,http://www.dantri.com.vn/blog.rss, 1, 0
        2c822c63-b222-4f7d-a872-3d9495ad0a27,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Games,http://www.dantri.com.vn/games_asp_.rss, 1, 0
        2616173e-392f-41c0-9615-191410737572,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Tin Game,http://www.dantri.com.vn/tin-game.rss, 1, 0
        7b3db06a-cabd-4a5c-acc0-29cf58bb44b2,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Điểm Game,http://www.dantri.com.vn/diem-game.rss, 1, 0
        8aeb4a22-6613-4d39-a948-6c7d7b7efbe7,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Game thể thao,http://www.dantri.com.vn/game-the-thao.rss, 1, 0
        2995daff-4bd2-4a49-b5a4-3bbf89406fbf,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Game chiến thuật,http://www.dantri.com.vn/game-chien-thuat.rss, 1, 0
        0a8e8875-0e84-4736-a64e-a86a092b7e4d,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Game hành động,http://www.dantri.com.vn/game-hanh-dong.rss, 1, 0
        101bad19-51d1-49b5-b421-638127372629,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Mobile Games,http://www.dantri.com.vn/mobile-games.rss, 1, 0
        6ee6b7e4-4ef9-4704-91e1-a97f2cc07df6,ddc17557-3e9c-4937-98fa-bc3c0e514bcd,Board games,http://www.dantri.com.vn/board-games.rss, 1, 0
        219e65bd-451e-48f4-b549-e0804ff9a657,ae68f542-48d6-4622-9419-1ee4461babf4,Trang chủ	,http://vietnamnet.vn/rss/home.rss, 1, 1
        e0fab5b4-1636-44ce-9d4e-13a77d03b196,ae68f542-48d6-4622-9419-1ee4461babf4,Tin mới nóng,http://vietnamnet.vn/rss/moi-nong.rss, 1,1
        2671d60e-a304-4ce8-a95c-2732a33e4c7f,ae68f542-48d6-4622-9419-1ee4461babf4,Tin nổi bật,http://vietnamnet.vn/rss/tin-noi-bat.rss, 1, 0
        4d883ba0-c34e-4e0c-a06b-249f1b5f4621,ae68f542-48d6-4622-9419-1ee4461babf4,Xã hội,http://vietnamnet.vn/rss/xa-hoi.rss, 1, 0
        32fd5b2c-3055-4018-91c0-4950e32241d9,ae68f542-48d6-4622-9419-1ee4461babf4,Giáo dục,http://vietnamnet.vn/rss/giao-duc.rss		, 1, 0
        292afc69-39a8-4768-908a-0bed10ce6333,ae68f542-48d6-4622-9419-1ee4461babf4,Chính trị,http://vietnamnet.vn/rss/chinh-tri.rss,		1, 0
        c10d8c9e-7aad-4673-b3ea-925441593c0f,ae68f542-48d6-4622-9419-1ee4461babf4,Tuần Việt Nam,http://vietnamnet.vn/rss/tuanvietnam.rss		, 1, 0
        567b9103-a8bd-4196-be43-905f3f66181b,ae68f542-48d6-4622-9419-1ee4461babf4,Đời sống,http://vietnamnet.vn/rss/doi-song.rss	, 1, 0
        96c697c5-1d31-485c-8204-b94a224f1469,ae68f542-48d6-4622-9419-1ee4461babf4,Kinh tế,http://vietnamnet.vn/rss/kinh-te.rss	, 1, 0
        f4ce37c9-f70d-4cde-b137-54a0a17cfaf1,ae68f542-48d6-4622-9419-1ee4461babf4,Quốc tế,http://vietnamnet.vn/rss/quoc-te.rss,	1, 1
        b3dfff0d-80b3-4473-a301-45e8914906ad,ae68f542-48d6-4622-9419-1ee4461babf4,Văn hóa,http://vietnamnet.vn/rss/van-hoa.rss,	1, 1
        b7757374-03f5-4fc2-b840-3f768c79db6c,ae68f542-48d6-4622-9419-1ee4461babf4,Khoa học,http://vietnamnet.vn/rss/khoa-hoc.rss		, 1, 0
        1eed0e7b-0793-4e28-918f-0811e1c7f135,ae68f542-48d6-4622-9419-1ee4461babf4,CNTT - Viễn thông,http://vietnamnet.vn/rss/cong-nghe-thong-tin-vien-thong.rss,		1,1
        0df71be8-4767-4e64-90ab-c38fb1a6626d,ae68f542-48d6-4622-9419-1ee4461babf4,Bạn đọc,http://vietnamnet.vn/rss/ban-doc-phap-luat.rss	, 1, 0
        e576b7cc-a77f-4aec-ba66-745292e5098a,ae68f542-48d6-4622-9419-1ee4461babf4,Thế giới ảnh,http://vietnamnet.vn/rss/the-gioi-anh.rss, 1, 0
        a947f475-b7c6-48ca-b279-a3127528702b,51507882-9b60-4cf3-8523-2646366de8ee, Trang chủ, http://www.thanhnien.com.vn/_layouts/newsrss.aspx, 1, 1
        35a4eb83-2130-4d71-b937-e054e06999b9,51507882-9b60-4cf3-8523-2646366de8ee, Chính trị - Xã hội, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ch%C3%ADnh+tr%E1%BB%8B+-+X%C3%A3+h%E1%BB%99i, 1,0
        bd7783e5-6b82-4b8e-9c61-353afb6a1c56,51507882-9b60-4cf3-8523-2646366de8ee, Phóng sự, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ph%C3%B3ng+s%E1%BB%B1 , 1, 0
        f7d70988-046d-41a3-9e7f-19bf1de6a0b0,51507882-9b60-4cf3-8523-2646366de8ee, Pháp luật, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ph%C3%A1p+lu%E1%BA%ADt, 1, 0
        376354b9-b82b-4341-bc11-c0a1ad8d82b4,51507882-9b60-4cf3-8523-2646366de8ee, Thế giới trẻ, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Th%E1%BA%BF+gi%E1%BB%9Bi+tr%E1%BA%BB, 1, 0
        62bc5abc-06ac-4b7d-8d71-8e615c07ea5b,51507882-9b60-4cf3-8523-2646366de8ee, Hoạt động Đoàn - Hội, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ho%E1%BA%A1t+%C4%91%E1%BB%99ng+%C4%90o%C3%A0n-H%E1%BB%99i, 1, 0
        b4bfed8d-8692-438b-ae4d-713024738240,51507882-9b60-4cf3-8523-2646366de8ee, Kinh tế, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Kinh+t%E1%BA%BF, 1, 1
        624756a6-bc71-46c9-93db-b4323945b319,51507882-9b60-4cf3-8523-2646366de8ee, Chứng khoán, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ch%E1%BB%A9ng+kho%C3%A1n, 1, 0
        4a39cde0-1cf2-4673-ac06-2f721e1f200a,51507882-9b60-4cf3-8523-2646366de8ee, Nhà đất, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Nh%C3%A0+%C4%91%E1%BA%A5t, 1, 0
        d8f0c1ea-e045-4e1f-b8d0-17c62ef81074,51507882-9b60-4cf3-8523-2646366de8ee, Du lịch, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Du+l%E1%BB%8Bch, 1, 0
        61bb68b3-2a01-4338-895f-8a33c2ec0e30,51507882-9b60-4cf3-8523-2646366de8ee, Gương mặt doanh nhân, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=G%C6%B0%C6%A1ng+m%E1%BA%B7t+doanh+nh%C3%A2n, 1, 0
        0ba06408-5700-49e1-91ec-f4fb4560bced,51507882-9b60-4cf3-8523-2646366de8ee, Khuyến mãi - Sản phẩm mới, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Khuy%E1%BA%BFn+m%C3%A3i+-+S%E1%BA%A3n+ph%E1%BA%A9m+m%E1%BB%9Bi, 1, 0
        aea81c37-a685-462e-a4aa-bf20614507a0,51507882-9b60-4cf3-8523-2646366de8ee, Thế giới, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Th%E1%BA%BF+gi%E1%BB%9Bi, 1, 1
        21d9cda7-ad72-4581-b571-99e62da4fcad,51507882-9b60-4cf3-8523-2646366de8ee, Tư liệu, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=T%C6%B0+li%E1%BB%87u, 1, 0
        4a2a5c53-6e03-4b4c-9a7f-659e35bc5672,51507882-9b60-4cf3-8523-2646366de8ee, Quan sát, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Quan+s%C3%A1t, 1, 0
        8b658067-0b5e-45ed-8e99-e0d1c16af0d9,51507882-9b60-4cf3-8523-2646366de8ee, Văn hóa - Nghệ thuật, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=V%C4%83n+h%C3%B3a+-+Ngh%E1%BB%87+thu%E1%BA%ADt, 1, 1
        4baeb426-573e-4503-8441-ca26e951b7fe,51507882-9b60-4cf3-8523-2646366de8ee, Văn học, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=V%C4%83n+h%E1%BB%8Dc, 1, 0
        7cf56cdb-289d-476f-bf44-f35083485eb9,51507882-9b60-4cf3-8523-2646366de8ee, Âm nhạc, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%C3%82m+nh%E1%BA%A1c, 1, 0
        0cf76bce-bebe-4ce8-9214-ff590fdf8dcc,51507882-9b60-4cf3-8523-2646366de8ee, Điện ảnh, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%C4%90i%E1%BB%87n+%E1%BA%A3nh, 1,0
        d6e8673e-ff2c-476c-be18-6ae800aeadda,51507882-9b60-4cf3-8523-2646366de8ee, Mỹ thuật, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=M%E1%BB%B9+thu%E1%BA%ADt, 1, 0
        a4187888-dae1-4bf3-85fc-06d8e22fe076,51507882-9b60-4cf3-8523-2646366de8ee, Thời trang, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Th%E1%BB%9Di+trang, 1, 0
        a6229ccb-b035-4554-ac4a-f97a98110a44,51507882-9b60-4cf3-8523-2646366de8ee, Sân khấu, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=S%C3%A2n+kh%E1%BA%A5u, 1, 0
        cb77cc52-cee3-4306-bb2a-d77a90a9e142,51507882-9b60-4cf3-8523-2646366de8ee, Shop Văn nghệ, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Shop+V%C4%83n+Ngh%E1%BB%87, 1, 0
        5fcfbbbf-62fe-4206-ae71-28d98fb5e394,51507882-9b60-4cf3-8523-2646366de8ee, Xem - Nghe - Đọc, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Xem+-+Nghe+-+%C4%90%E1%BB%8Dc, 1, 0
        0da3790c-7ab8-4a55-b2ef-88ac03163c20,51507882-9b60-4cf3-8523-2646366de8ee, Truyền hình, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Truy%E1%BB%81n+h%C3%ACnh, 1, 0
        32ecad12-6498-4049-b0d5-7e6215c1d155,51507882-9b60-4cf3-8523-2646366de8ee, Camera, http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Camera, 1, 0
        9a4e913e-afd0-4257-886d-1f3d720ed324,51507882-9b60-4cf3-8523-2646366de8ee,Giáo dục,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Gi%C3%A1o+d%E1%BB%A5c, 1, 0
        18fc0263-5e3f-439b-8bba-74c76e9d9c86,51507882-9b60-4cf3-8523-2646366de8ee,Du học,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Du+h%E1%BB%8Dc, 1, 0
        e21ac2ef-3845-47f7-9bb5-2106b4e2aa0f,51507882-9b60-4cf3-8523-2646366de8ee,Tuyển sinh,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Tuy%E1%BB%83n+sinh, 1, 0
        7e84a27d-1492-4cf2-b260-af541ccac763,51507882-9b60-4cf3-8523-2646366de8ee,Trắc nghiệm,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Tr%E1%BA%AFc+nghi%E1%BB%87m, 1, 0
        370d600e-02bd-4c78-85f3-ffb926d31ea8,51507882-9b60-4cf3-8523-2646366de8ee,CNTT,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=C%C3%B4ng+ngh%E1%BB%87+th%C3%B4ng+tin, 1, 1
        1e18fbd4-aa2a-4da2-be71-03c9193878b9,51507882-9b60-4cf3-8523-2646366de8ee,Kinh nghiệm,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Kinh+nghi%E1%BB%87m, 1, 0
        7894e0d6-16ea-46e3-a144-7edfa76db580,51507882-9b60-4cf3-8523-2646366de8ee,Sản phẩm mới,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=S%E1%BA%A3n+ph%E1%BA%A9m+m%E1%BB%9Bi, 1, 0
        29172827-abc3-4232-9d90-a4069a8e072d,51507882-9b60-4cf3-8523-2646366de8ee,Games,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Games, 1, 0
        5b73c2a5-90e5-4a3e-8800-3143f6d8d891,51507882-9b60-4cf3-8523-2646366de8ee,Khoa học,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Khoa+h%E1%BB%8Dc, 1, 0
        fc974e1c-f154-4189-a3bc-ea45c68e845a,51507882-9b60-4cf3-8523-2646366de8ee,Sức khỏe,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=S%E1%BB%A9c+kh%E1%BB%8Fe, 1, 0
        10bfc820-9a2e-426b-80be-da3ab4adfbfd,51507882-9b60-4cf3-8523-2646366de8ee,Tư vấn ung thư,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=T%C6%B0+v%E1%BA%A5n+ung+th%C6%B0, 1, 0
        73f253b3-5016-4b7a-91a2-8b86c268525c,51507882-9b60-4cf3-8523-2646366de8ee,Đời sống,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%C4%90%E1%BB%9Di+s%E1%BB%91ng, 1, 0
        3ff282f7-f77b-471f-b405-cd6a072c9c58,51507882-9b60-4cf3-8523-2646366de8ee,Giải trí,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Gi%E1%BA%A3i+tr%C3%AD, 1, 1
        16511455-b9af-4b21-929e-1e7028e2d34e,51507882-9b60-4cf3-8523-2646366de8ee,Hôn nhân,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=H%C3%B4n+nh%C3%A2n, 1, 0
        8217a31a-2057-451c-8f52-647a99980365,51507882-9b60-4cf3-8523-2646366de8ee,Tư vấn,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=T%C6%B0+v%E1%BA%A5n, 1, 0
        b469c20f-534e-4ff1-94ee-9ab6a415e1f9,51507882-9b60-4cf3-8523-2646366de8ee,Vườn hồng,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=V%C6%B0%E1%BB%9Dn+h%E1%BB%93ng, 1, 0
        20af3633-93db-45c9-a0a6-7d68f5ec6714,51507882-9b60-4cf3-8523-2646366de8ee,Ẩm thực,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%E1%BA%A8m+th%E1%BB%B1c, 1, 0
        279dbc5a-7143-41e5-a30f-67dd7b928100,51507882-9b60-4cf3-8523-2646366de8ee,Làm đẹp,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=L%C3%A0m+%C4%91%E1%BA%B9p, 1, 0
        e67e97a6-6e57-4445-9181-99e84db5c90c,51507882-9b60-4cf3-8523-2646366de8ee,Sinh hoạt cộng đồng,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Sinh+ho%E1%BA%A1t+c%E1%BB%99ng+%C4%91%E1%BB%93ng, 1, 0
        2c96a9c0-e09c-465b-a2f1-97f7f68233ea,51507882-9b60-4cf3-8523-2646366de8ee,Thư giản,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Th%C6%B0+gi%C3%A3n, 1, 0
        298a3314-00a0-4550-982d-93ab3c5c227e,51507882-9b60-4cf3-8523-2646366de8ee,Ảnh vui,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%E1%BA%A2nh+vui, 1, 0
        2cc16fa6-dcb7-4790-ac57-754348d462c5,51507882-9b60-4cf3-8523-2646366de8ee,Lượm vặt,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=L%C6%B0%E1%BB%A3m+v%E1%BA%B7t, 1, 0
        6b274f9a-b7a6-4cf9-991b-99ed33d2a6e1,51507882-9b60-4cf3-8523-2646366de8ee,Chuyên mục khác,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Chuy%C3%AAn+m%E1%BB%A5c+kh%C3%A1c, 1, 0
        986b8616-33d3-4ce4-adc3-289af4da20c2,51507882-9b60-4cf3-8523-2646366de8ee,Toà soạn,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=T%C3%B2a+so%E1%BA%A1n, 1, 0
        f9cb3214-4f6b-4cf3-81aa-eff39a2be334,51507882-9b60-4cf3-8523-2646366de8ee,Bạn đọc,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=B%E1%BA%A1n+%C4%91%E1%BB%8Dc, 1, 0
        d4721101-722e-4543-8a27-520eea34c446,51507882-9b60-4cf3-8523-2646366de8ee,Ý kiến,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=%C3%9D+ki%E1%BA%BFn, 1, 0
        d6422afd-241e-4925-9915-c8bce701ad04,51507882-9b60-4cf3-8523-2646366de8ee,Kiều bào,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Ki%E1%BB%81u+b%C3%A0o, 1, 0
        3e4b84f7-0866-4caa-889c-db30039ddea1,51507882-9b60-4cf3-8523-2646366de8ee,Nhà đất,http://www.thanhnien.com.vn/_layouts/newsrss.aspx?Channel=Nh%C3%A0+%C4%91%E1%BA%A5t, 1, 0
        2f3f0241-1a67-4417-a9fc-027c76a5d503,25b84657-159b-40bc-8507-f97e72440797,Đất nước - con người,http://congan.com.vn/vie/rss/rss.php?catid=880, 1, 0
        af737929-aec7-493f-927f-51b91a24c3a4,25b84657-159b-40bc-8507-f97e72440797,    Ẩm thực,http://congan.com.vn/vie/rss/rss.php?catid=442, 1, 0
        1c10dc31-ea8e-467a-a070-c5e19ada93d6,25b84657-159b-40bc-8507-f97e72440797,    An toàn giao thông,http://congan.com.vn/vie/rss/rss.php?catid=706, 1, 0
        64f11a1f-c61d-43f8-89ed-2beb410b4ca7,25b84657-159b-40bc-8507-f97e72440797,    Bình yên cuộc sống,http://congan.com.vn/vie/rss/rss.php?catid=708, 1, 1
        3a6c4e48-ef03-4a27-8b3d-4b3a260096f2,25b84657-159b-40bc-8507-f97e72440797,    Bóng đá,http://congan.com.vn/vie/rss/rss.php?catid=1180, 1, 1
        c213c009-f71f-4f72-9d9c-77cecbb41670,25b84657-159b-40bc-8507-f97e72440797,    Cảnh giác,http://congan.com.vn/vie/rss/rss.php?catid=1082, 1, 1
        9a77700b-9438-448a-a386-7fbf1de44f3c,25b84657-159b-40bc-8507-f97e72440797,    Chuyện bốn phương,http://congan.com.vn/vie/rss/rss.php?catid=1124, 1, 1
        bbffeb54-47bd-4b1e-95e8-5362f72bb764,25b84657-159b-40bc-8507-f97e72440797,    Chuyện hàng tuần,http://congan.com.vn/vie/rss/rss.php?catid=1060, 1, 0
        03efa9aa-6dec-4a7c-b661-4eee375b0a21,25b84657-159b-40bc-8507-f97e72440797,    Giao lưu trực tuyến,http://congan.com.vn/vie/rss/rss.php?catid=1744, 1, 0
        92e8a622-230b-4ab3-8603-a77f373df5d8,25b84657-159b-40bc-8507-f97e72440797,    Hướng dẫn nấu ăn,http://congan.com.vn/vie/rss/rss.php?catid=462, 1, 0
        272ac890-b0bf-4096-ac25-a93e46e832ab,25b84657-159b-40bc-8507-f97e72440797,    Hậu trường,http://congan.com.vn/vie/rss/rss.php?catid=1122, 1, 1
        9634244d-3795-44ef-9273-a06377c732d2,25b84657-159b-40bc-8507-f97e72440797,    Khám phá thế giới,http://congan.com.vn/vie/rss/rss.php?catid=1123, 1, 0
        9123d4b0-c349-4448-95a6-6ebbf3afa824,25b84657-159b-40bc-8507-f97e72440797,    Kinh tế,http://congan.com.vn/vie/rss/rss.php?catid=707, 1, 0
        3a836bb0-ef43-43d3-9453-75ec797ce9e0,25b84657-159b-40bc-8507-f97e72440797,    Lệnh truy nã,http://congan.com.vn/vie/rss/rss.php?catid=842, 1, 0
        564381e3-f25f-4726-9cf5-2ef9a7c4b146,25b84657-159b-40bc-8507-f97e72440797,    Làm đẹp,http://congan.com.vn/vie/rss/rss.php?catid=422, 1, 0
        c8c7e83c-f2f1-42e2-9d6a-d849ebe0db2d,25b84657-159b-40bc-8507-f97e72440797,    Mảnh đời bất hạnh,http://congan.com.vn/vie/rss/rss.php?catid=1103, 1, 0
        2a0f4b62-7d5b-499e-9d46-dd355d10c89a,25b84657-159b-40bc-8507-f97e72440797,    Ngôi nhà ấm,http://congan.com.vn/vie/rss/rss.php?catid=2183, 1, 0
        920c409b-2e6b-4888-8312-ba2c3ec15dc0,25b84657-159b-40bc-8507-f97e72440797,    Pháp đình,http://congan.com.vn/vie/rss/rss.php?catid=704, 1, 0
        25a341b3-3477-4818-90e7-72a7bad81dc4,25b84657-159b-40bc-8507-f97e72440797,    Phóng sự điều tra,http://congan.com.vn/vie/rss/rss.php?catid=702, 1, 1
        cb40066c-f885-482d-8ccb-067675f2f88d,25b84657-159b-40bc-8507-f97e72440797,    Quốc tế,http://congan.com.vn/vie/rss/rss.php?catid=1120, 1, 0
        04ff464a-0719-4d70-ae78-d4f18314a6ef,25b84657-159b-40bc-8507-f97e72440797,    Sức khoẻ cộng đồng,http://congan.com.vn/vie/rss/rss.php?catid=402, 1, 0
        c87064b8-9e99-43e1-90e7-3108cf7403fa,25b84657-159b-40bc-8507-f97e72440797,    Tư vấn pháp luật,http://congan.com.vn/vie/rss/rss.php?catid=1160, 1, 0
        b785e3c3-c3ec-47a0-81db-5914cceb4265,25b84657-159b-40bc-8507-f97e72440797,    Tấm lòng vàng,http://congan.com.vn/vie/rss/rss.php?catid=1104, 1, 0
        bf05f3f7-bb6b-472a-a1e9-84c4aadf43df,25b84657-159b-40bc-8507-f97e72440797,    Tỏa sáng giữa đời thường,http://congan.com.vn/vie/rss/rss.php?catid=2184, 1, 0
        87778974-0edc-4455-a709-6980cf3d7af9,25b84657-159b-40bc-8507-f97e72440797,    Thư giãn,http://congan.com.vn/vie/rss/rss.php?catid=1126, 1, 0
        35183402-1076-4cd4-956c-59b7d1047823,25b84657-159b-40bc-8507-f97e72440797,    Thể thao,http://congan.com.vn/vie/rss/rss.php?catid=941, 1, 0
        d9524e48-07a9-4f32-85c2-a90797fc912e,25b84657-159b-40bc-8507-f97e72440797,    Thị trường bất động sản,http://congan.com.vn/vie/rss/rss.php?catid=1125, 1, 0
        f225e5f6-4061-43a0-afa1-853a1fe229ab,25b84657-159b-40bc-8507-f97e72440797,    Thời sự,http://congan.com.vn/vie/rss/rss.php?catid=681, 1, 1
        0ad48fcf-3a66-493b-8a2b-f615305922b8,25b84657-159b-40bc-8507-f97e72440797,    Thông tin nhân đạo,http://congan.com.vn/vie/rss/rss.php?catid=1683, 1, 0
        de8c8f4f-7810-4cb9-89ec-24423266c662,25b84657-159b-40bc-8507-f97e72440797,    Tiếng nói người dân,http://congan.com.vn/vie/rss/rss.php?catid=1121, 1, 0
        48f4b5dd-be35-4e29-b793-6879f074ae01,25b84657-159b-40bc-8507-f97e72440797,    Tin đó đây,http://congan.com.vn/vie/rss/rss.php?catid=682, 1, 0
        01833fd2-75d0-4553-a8eb-2e76f7cb30f2,25b84657-159b-40bc-8507-f97e72440797,    Trật tự xã hội,http://congan.com.vn/vie/rss/rss.php?catid=703, 1, 1
        93ec9da8-3788-48fd-a450-ecd70de01856,25b84657-159b-40bc-8507-f97e72440797,    Tìm chủ sở hữu,http://congan.com.vn/vie/rss/rss.php?catid=1161, 1, 0
        7eba736b-353f-4df3-a3ea-97a032c3c263,25b84657-159b-40bc-8507-f97e72440797,    Tòa soạn - Bạn đọc,http://congan.com.vn/vie/rss/rss.php?catid=1101, 1, 0
        f0122a47-3fce-4fec-97c9-4326e5fbf203,25b84657-159b-40bc-8507-f97e72440797,    Văn học - Sáng tác,http://congan.com.vn/vie/rss/rss.php?catid=1883, 1, 0
        1b30460f-ff8d-47c2-b6ce-e2a657038253,25b84657-159b-40bc-8507-f97e72440797,    Văn hóa,http://congan.com.vn/vie/rss/rss.php?catid=882, 1, 1
        c7c446cc-d4ff-4e30-8d38-477bd03c6f9e,25b84657-159b-40bc-8507-f97e72440797,    Vấn đề hôm nay,http://congan.com.vn/vie/rss/rss.php?catid=942, 1, 0
        7ba5d09b-2ed3-4c56-adff-c21dbf6bbe9f,25b84657-159b-40bc-8507-f97e72440797,    Xuân 2012,http://congan.com.vn/vie/rss/rss.php?catid=1663, 1, 0
        47057ce7-1d9b-4fd4-91fb-e22ecf57d3df,25b84657-159b-40bc-8507-f97e72440797,    Xuân 2013,http://congan.com.vn/vie/rss/rss.php?catid=1903, 1, 0
        6b0cd722-61f1-41df-bbc7-66b97493589a,25b84657-159b-40bc-8507-f97e72440797,    Xã hội từ thiện,http://congan.com.vn/vie/rss/rss.php?catid=1100, 1, 0
        f46b4627-8418-47f4-9372-8b4e2daec3d5, a1b77305-7182-43ff-b462-4231c101086d, Hài vl, http://www.haivl.com/rss, 1, 1
        c16392f2-9918-4a2f-a6a3-7e0b1bf9c395,cac4a482-fb74-4ef6-8797-638cfb542f58,Tin tức trong ngày,http://www.24h.com.vn/upload/rss/tintuctrongngay.rss, 1, 1
        3b85f3e2-84fe-48a4-a4b2-6f92dd368636,cac4a482-fb74-4ef6-8797-638cfb542f58,Bóng đá,http://www.24h.com.vn/upload/rss/bongda.rss, 1, 1
        67cbdaba-86c8-4cfc-acc5-e7754b5a9a9a,cac4a482-fb74-4ef6-8797-638cfb542f58,An ninh - Hình sự,http://www.24h.com.vn/upload/rss/anninhhinhsu.rss, 1, 0
        e74d9400-2a8e-4fc0-a185-06499516de57,cac4a482-fb74-4ef6-8797-638cfb542f58,Thời trang,http://www.24h.com.vn/upload/rss/thoitrang.rss, 1, 1
        81407821-0573-423f-bbde-555599219e57,cac4a482-fb74-4ef6-8797-638cfb542f58,Thời trang Hi-tech,http://www.24h.com.vn/upload/rss/thoitranghitech.rss, 1, 0
        bd50d029-1190-4aee-941a-c1f8631f63ab,cac4a482-fb74-4ef6-8797-638cfb542f58,Tài chính – Bất động sản,http://www.24h.com.vn/upload/rss/taichinhbatdongsan.rss, 1, 0
        d6416ee8-1bc6-4e94-9012-4022a04e4ed4,cac4a482-fb74-4ef6-8797-638cfb542f58,Ẩm thực,http://www.24h.com.vn/upload/rss/amthuc.rss, 1, 0
        31f1d7e0-b5fa-45b9-8080-aca7a1d772b3,cac4a482-fb74-4ef6-8797-638cfb542f58,Làm đẹp,http://www.24h.com.vn/upload/rss/lamdep.rss, 1, 0
        b9775c3e-6fc3-4382-a20c-3155e52ddc8e,cac4a482-fb74-4ef6-8797-638cfb542f58,Phim,http://www.24h.com.vn/upload/rss/phim.rss, 1, 0
        e8c9d7da-231d-41a9-b1a0-43a275629ae3,cac4a482-fb74-4ef6-8797-638cfb542f58,Giáo dục - du học,http://www.24h.com.vn/upload/rss/giaoducduhoc.rss, 1, 0
        12fb08f0-9400-4ef6-b51f-db44f89ebfbb,cac4a482-fb74-4ef6-8797-638cfb542f58,Bạn trẻ - Cuộc sống,http://www.24h.com.vn/upload/rss/bantrecuocsong.rss, 1, 0
        94ebc489-93a7-431b-8f49-3222e5f8230f,cac4a482-fb74-4ef6-8797-638cfb542f58,Ca nhạc - MTV,http://www.24h.com.vn/upload/rss/canhacmtv.rss, 1, 0
        6faa6131-9fe3-41ee-9340-9432cddd6086,cac4a482-fb74-4ef6-8797-638cfb542f58,Thể thao,http://www.24h.com.vn/upload/rss/thethao.rss, 1, 1
        00f22889-1fbc-40f9-baab-ff1cbdf51057,cac4a482-fb74-4ef6-8797-638cfb542f58,Phi thường - kỳ quặc,http://www.24h.com.vn/upload/rss/phithuongkyquac.rss, 1, 0
        a0f08840-0859-44cc-bdea-9f0349a71495,cac4a482-fb74-4ef6-8797-638cfb542f58,Công nghệ thông tin,http://www.24h.com.vn/upload/rss/congnghethongtin.rss, 1, 1
        632c4584-ff9e-49c9-8236-fafa6822f3c9,cac4a482-fb74-4ef6-8797-638cfb542f58,Ô tô - Xe máy,http://www.24h.com.vn/upload/rss/otoxemay.rss, 1, 0
        bb7a4f24-fa70-4f12-a426-25227aa5efd1,cac4a482-fb74-4ef6-8797-638cfb542f58,Thị trường - Tiêu dùng,http://www.24h.com.vn/upload/rss/thitruongtieudung.rss, 1, 0
        b9777301-d75b-4162-a0b4-accadb1f0cb0,cac4a482-fb74-4ef6-8797-638cfb542f58,Du lịch,http://www.24h.com.vn/upload/rss/dulich.rss, 1, 0
        e8da7b38-2a07-416c-9970-ec8f2401fa98,cac4a482-fb74-4ef6-8797-638cfb542f58,Sức khỏe đời sống,http://www.24h.com.vn/upload/rss/suckhoedoisong.rss, 1, 0
        24340dc3-a088-4f4c-99f8-8d82f1ac5d19,cac4a482-fb74-4ef6-8797-638cfb542f58,Cười 24h,http://www.24h.com.vn/upload/rss/cuoi24h.rss, 1, 0
        8dd3153c-5ed1-414f-aca7-d2acd0615dc6, e7ad6094-18fe-472f-b5da-7ba65164bb9c,Thông tin tổng hợp mới nhât,http://www.Bongda.com.vn/Rss/, 1, 1
        a008d36d-6f74-462a-b6fd-7f965e19a083, e7ad6094-18fe-472f-b5da-7ba65164bb9c,Thư viện ảnh hấp dẫn,http://www.Bongda.com.vn/Thu-Vien-Anh/Rss/, 1, 0
        eb6beca4-9c70-4516-ad24-222274545e2c, e7ad6094-18fe-472f-b5da-7ba65164bb9c,Các Video clip đặc sắc,http://www.Bongda.com.vn/Thu-Vien-Video/Rss/, 1, 0
        0ed5c415-ea7d-471e-b37c-2371fe03df93,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Hậu trường,http://ngoisao.net/rss/hau-truong.rss, 1, 1
        096bc270-6029-403f-a375-39c00ca10d8e,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thể thao,http://ngoisao.net/rss/the-thao.rss, 1, 1
        ec619cb2-9351-40a4-b601-d31df60f09bd,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thời cuộc,http://ngoisao.net/rss/thoi-cuoc.rss, 1, 1
        019eb9d2-0bff-4682-9a0a-d6307d2e1654,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Phong cách,http://ngoisao.net/rss/phong-cach.rss, 1, 0
        9b08b802-bc5f-4ab6-947b-4633c2d820d2,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thư giãn,http://ngoisao.net/rss/thu-gian.rss, 1, 0
        024dd80a-d850-4973-97b3-875d9a84e004,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Góc độc giả,http://ngoisao.net/rss/goc-doc-gia.rss, 1, 0
        8bf07482-d01c-444c-aca8-4e5028e392a3,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Cưới,http://ngoisao.net/rss/cuoi-hoi.rss, 1, 0
        ad74eee0-631b-44b1-a7ad-274e78c0d576,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Showbiz Việt,http://ngoisao.net/rss/showbiz-viet.rss, 1, 1
        23ccc2e8-1718-4c18-a786-92dd9d2737ea,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Châu Á,http://ngoisao.net/rss/chau-a.rss, 1, 0
        7dafae77-df9a-46d1-bb6a-393d73f3f29b,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Hollywood,http://ngoisao.net/rss/hollywood.rss, 1, 0
        5cf8ead4-4b5c-47e4-9f60-88b5e1701b64,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Bên lề,http://ngoisao.net/rss/ben-le.rss, 1, 0
        b93b4950-8564-4cf4-b128-a3d1eafc4cbe,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Clip,http://ngoisao.net/rss/clip.rss, 1, 0
        e3c997d3-7d91-4b91-9164-0c82f2019123,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Khỏe đẹp,http://ngoisao.net/rss/khoe-dep.rss, 1, 0
        f48334dd-bc39-4bda-bb48-06291ea6ec86,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,24h,http://ngoisao.net/rss/24h.rss, 1, 0
        93054ab0-8820-4832-b50a-bb7c5ab5dbb1,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Chuyện lạ,http://ngoisao.net/rss/chuyen-la.rss, 1, 0
        660e66cd-8a77-4fa0-9e9c-b202e375d420,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Hình sự,http://ngoisao.net/rss/hinh-su.rss, 1, 0
        f7757cbf-857e-4537-8c41-28b4be7ca04f,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thương trường,http://ngoisao.net/rss/thuong-truong.rss, 1, 0
        e67218cb-b882-434f-bd2b-5e069261700d,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thời trang,http://ngoisao.net/rss/thoi-trang.rss, 1, 1
        5e7572c8-70b3-49ff-b50d-959e86894f70,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Tâm tình,http://ngoisao.net/rss/tam-tinh.rss, 1, 0
        cc8e942d-b177-451e-a643-835bb26e425f,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Làm đẹp,http://ngoisao.net/rss/lam-dep.rss, 1, 0
        8f621fad-840c-4a4c-b448-16797d26ace0,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Trắc nghiệm,http://ngoisao.net/rss/trac-nghiem.rss, 1, 0
        d30da634-4ba4-4e05-9346-11c1565de8aa,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Ăn chơi,http://ngoisao.net/rss/an-choi.rss, 1, 0
        41a9c8bc-c908-444c-a608-4fb6423456f2,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Dân chơi,http://ngoisao.net/rss/dan-choi.rss, 1, 0
        c60422cb-8ca4-480e-87c8-acd080d7a208,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Cười,http://ngoisao.net/rss/cuoi.rss, 1, 0
        28e1e1b4-8732-4bf9-8794-19229084d726,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Game,http://ngoisao.net/rss/game.rss, 1, 0
        917e7e22-676d-4175-8034-8279712525de,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Chơi blog,http://ngoisao.net/rss/choi-blog.rss, 1, 0
        51ff5219-b68a-40f3-b3bb-559b32bde530,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Thi ảnh,http://ngoisao.net/rss/thi-anh.rss, 1, 0
        a5af74ca-0da3-43f6-bf01-110767ada38f,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Miss,http://ngoisao.net/rss/miss.rss, 1, 0
        ad31fbdc-d41d-4479-98de-3f633683c37f,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Cô dâu,http://ngoisao.net/rss/co-dau.rss, 1, 0
        aab45a08-2877-4d18-9ef0-acb0e2e623ad,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Cẩm nang,http://ngoisao.net/rss/cam-nang.rss, 1, 0
        193347f9-015f-4001-b7fb-8f77eafc7a2d,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Ảnh cưới,http://ngoisao.net/rss/anh-cuoi.rss, 1, 0
        d67bc5ee-36ff-47b6-b1a0-fee25a108677,11d64201-5ef7-47d4-9dc9-aa26e4dee31b,Chia sẻ,http://ngoisao.net/rss/chia-se.rss, 1, 0
        1441281e-b79f-4b49-a675-b253669c82d1, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Trang chủ, http://thethaovanhoa.vn/trang-chu.rss, 1, 1
        0960d4c6-b93c-4c6b-8c9b-3b47dad2bbfd, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Bóng đá việt, http://thethaovanhoa.vn/bong-da-viet.rss, 1, 0
        5e7f703b-1327-4c36-aa8c-3d3d156a7427, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Bóng đá Anh, http://thethaovanhoa.vn/anh.rss, 1, 0
        2eff62ea-d31f-4af1-9aa5-8db34230202a, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Tây ban nha, http://thethaovanhoa.vn/tay-ban-nha.rss, 1, 0
        2d7428c1-7d0e-483b-ab44-0b0aafca1b3b, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Đức, http://thethaovanhoa.vn/duc.rss, 1, 0
        12b822d8-defe-421d-a087-fdf87eae91c5, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Italy, http://thethaovanhoa.vn/italy.rss, 1, 0
        4b62192b-ca70-44da-8d08-ebe264a074c5, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Champion League, http://thethaovanhoa.vn/champions-league.rss, 1, 0
        83c959fd-9440-4210-90e1-4bce75228121, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Thể thao, http://thethaovanhoa.vn/the-thao.rss, 1, 1
        55a9e4b0-9cc8-425a-b01a-74af8e2e3182, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Thế giới sao, http://thethaovanhoa.vn/the-gioi-sao.rss, 1, 1
        0260ed69-d957-426f-99c9-5e4c8197e156, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Văn hóa - Giải trí, http://thethaovanhoa.vn/van-hoa-giai-tri.rss, 1, 1
        c8f04e19-4eec-4053-be23-2f25b7938064, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Diễn đàn văn hóa, http://thethaovanhoa.vn/dien-dan-van-hoa.rss, 1, 0
        7d9fd604-311b-42b7-a6e7-708d106c2577, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Xã hội, http://thethaovanhoa.vn/xa-hoi.rss, 1, 0
        c4dd69d9-d907-46a3-b7e7-625d2e7511c9, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Thế giới, http://thethaovanhoa.vn/the-gioi.rss, 1, 0
        db54bfb3-ff6a-41dd-9eca-30b8c487cd47, fc3af6b0-093e-4b06-b25d-82d85a7528d0, Cười, http://thethaovanhoa.vn/nu-cuoi.rss, 1, 0
        48a3682e-9d96-4c16-90b3-de0d75d85a43, 51f83702-07eb-4ea9-9d29-28c3b0b438ed, kênh14.vn, http://kenh14.vn/home.rss, 1, 1
        88a6b52e-f22a-475a-97a2-c8f6d3edbd5c, adf4c5a9-3791-4fc6-bf3f-18e563480492, Trang chủ ,http://giadinh.net.vn/rss/trangchu , 1, 1
        03e99378-97c1-4e64-a282-8dd1c0e76df2, adf4c5a9-3791-4fc6-bf3f-18e563480492, Xã hội ,http://giadinh.net.vn/rss/xa-hoi , 1, 1
        e7cfb7b8-a0e5-4fa2-8ab7-95087c8ebbf6,adf4c5a9-3791-4fc6-bf3f-18e563480492, Chia sẻ ,http://giadinh.net.vn/rss/chia-se , 1, 0
        92cbb333-469f-406d-8ee1-f13ce6da1d0e,adf4c5a9-3791-4fc6-bf3f-18e563480492, Gia đình ,http://giadinh.net.vn/rss/gia-dinh , 1, 1
        e3c40d5e-78b0-4b17-8c77-8dfd528f98f3,adf4c5a9-3791-4fc6-bf3f-18e563480492, Văn hóa ,http://giadinh.net.vn/rss/van-hoa , 1, 0
        8cc8e733-17cf-46a7-8f38-8013f065436c,adf4c5a9-3791-4fc6-bf3f-18e563480492, Pháp luật ,http://giadinh.net.vn/rss/phap-luat , 1, 0
        b973c9a7-0b7d-47dc-b9f9-9ca7fc181c09,adf4c5a9-3791-4fc6-bf3f-18e563480492, Thế giới ,http://giadinh.net.vn/rss/the-gioi , 1, 0
        7430dc2d-180d-4290-8c7f-4ae96afb9bc0,adf4c5a9-3791-4fc6-bf3f-18e563480492, Sức khỏe ,http://giadinh.net.vn/rss/suc-khoe , 1, 1
        c9fba073-bd78-4a36-8318-6af84e658ea5,adf4c5a9-3791-4fc6-bf3f-18e563480492, Đời sống ,http://giadinh.net.vn/rss/doi-song , 1, 0
        0526e399-4532-424b-80ff-cdea55a6775c,adf4c5a9-3791-4fc6-bf3f-18e563480492, Nuôi dạy con ,http://giadinh.net.vn/rss/nuoi-day-con , 1, 0
        53702b44-c612-42ce-bb8e-b78a422c2da5,adf4c5a9-3791-4fc6-bf3f-18e563480492, Mua sắm ,http://giadinh.net.vn/rss/mua-sam , 1, 0
        4bf2ab10-ca95-48ea-aed4-845517e2454b,adf4c5a9-3791-4fc6-bf3f-18e563480492, Làm đẹp ,http://giadinh.net.vn/rss/lam-dep , 1, 0
        00302ca7-4c56-4318-b658-ed18c7863898,adf4c5a9-3791-4fc6-bf3f-18e563480492, Vòng tay nhân ái ,http://giadinh.net.vn/rss/vong-tay-nhan-ai , 1, 0
        a61a13d6-8e7c-4f30-bdec-086237e8a56c,adf4c5a9-3791-4fc6-bf3f-18e563480492, Blog ,http://giadinh.net.vn/rss/blog , 1, 0
        856bc2dd-321c-485b-aabb-30500774b75e,adf4c5a9-3791-4fc6-bf3f-18e563480492, Dân số ,http://giadinh.net.vn/rss/dan-so , 1, 0
        8b6a2fe5-0f7a-493c-bf84-168eb00426ca,adf4c5a9-3791-4fc6-bf3f-18e563480492, Y tế ,http://giadinh.net.vn/rss/y-te , 1, 0
        c5cc9479-1439-4a54-9848-676d51e7a63c,adf4c5a9-3791-4fc6-bf3f-18e563480492, Dữ liệu dân số ,http://giadinh.net.vn/rss/du-lieu-dan-so , 1, 0
        981768cb-d975-448f-87ef-cb36c80c5a43,adf4c5a9-3791-4fc6-bf3f-18e563480492, Hạt giống tâm hồn ,http://giadinh.net.vn/rss/hat-giong-tam-hon, 1, 0
        99b04c67-e764-417e-8a93-722d12983736, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Trang chủ, http://afamily.vn/trang-chu.rss, 1, 1
        7978c6dc-57a2-4d60-bca8-a24e49a12e9b, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Đẹp, http://afamily.vn/dep.rss, 1, 0
        ad59b03c-374d-497c-b1b6-64c2013d2669, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Đời sống, http://afamily.vn/doi-song.rss, 1, 1
        411796f1-0a71-4056-a759-799a23f5db12, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Công sở, http://afamily.vn/cong-so.rss, 1, 1
        63c4c810-8d97-4ead-803f-1c81fbdd39d5, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Ăn ngon, http://afamily.vn/an-ngon.rss, 1, 0
        573b7dd1-1073-4175-88b0-c0bb3373ca0a, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Tình yêu - Hôn nhân, http://afamily.vn/tinh-yeu-hon-nhan.rss, 1, 1
        aadd7879-b651-4d2f-9134-90819b2395fa, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Sức khỏe, http://afamily.vn/suc-khoe.rss, 1, 0
        b49b1ba9-8440-4257-9d03-7548aa0c9cbd, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Tâm sự, http://afamily.vn/tam-su.rss, 1, 0
        db859aaa-2b8a-4fbd-b943-8e1c611e8faa, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Mẹ & Bé, http://afamily.vn/me-va-be.rss, 1, 0
        908efd58-a897-4525-8b49-649594fa4eb7, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Nhà hay, http://afamily.vn/nha-hay.rss, 1, 0
        da839813-900c-4705-9395-d451161170f8, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Hậu trường, http://afamily.vn/hau-truong.rss, 1, 1
        4e9d46dd-3b92-4c45-8b5a-1e485b901ef2, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Giải trí, http://afamily.vn/giai-tri.rss, 1, 1
        446e47eb-9403-492e-bb17-3a34d2544db7, 9fb41b7b-0ffb-44d1-a6a1-1c1bf5625494, Chuyện lạ, http://afamily.vn/chuyen-la.rss, 1, 0
        3abdcd4f-46f4-4a21-bd30-f6671c1cd654,6fb6a19c-74ac-45da-be34-323ab6403b27,Các bản tin mới nhất, http://kienthucngaynay.info/am/RSS/rssnews-pro.php, 1, 1
        bc3384d7-5e2d-42ff-b286-f9c3ea8eb61e,6fb6a19c-74ac-45da-be34-323ab6403b27,Chính trị - xã hội, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=1&Title=Chính trị - xã hội, 1, 1
        662efa06-0de9-42e5-91c4-634b18cdcc38,6fb6a19c-74ac-45da-be34-323ab6403b27,Gương mặt chính khách, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=2&Title=Gương mặt chính khách, 1, 0
        f58c9186-8d00-4ddf-b49a-94b8a48d18ec,6fb6a19c-74ac-45da-be34-323ab6403b27,Đối thoại trực tuyến, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=3&Title=Đối thoại trực tuyến, 1, 0
        5c468a56-b7f8-45ca-a169-ab6aa07f48f8,6fb6a19c-74ac-45da-be34-323ab6403b27,Ai? Sao?, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=4&Title=Ai? Sao?, 1, 0
        9187f90b-2562-4d0c-92ab-72a67f550327,6fb6a19c-74ac-45da-be34-323ab6403b27,Tri thức & Phát triển, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=5&Title=Tri thức & Phát triển, 1, 0
        e798b2ac-c4f9-4ac1-abdf-7adcbaeddd8b,6fb6a19c-74ac-45da-be34-323ab6403b27,Chuyện Đông chuyện Tây, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=6&Title=Chuyện Đông chuyện Tây, 1, 0
        78bd3606-3709-4cb0-84b9-12e118873979,6fb6a19c-74ac-45da-be34-323ab6403b27,Khoa học không giả tưởng, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=7&Title=Khoa học không giả tưởng, 1, 0
        86280700-a1af-4401-9033-82e34d660706,6fb6a19c-74ac-45da-be34-323ab6403b27,Tư liệu nhiều kỳ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=8&Title=Tư liệu nhiều kỳ, 1, 0
        4a9bf3ef-0a71-44de-b524-f46026a031e1,6fb6a19c-74ac-45da-be34-323ab6403b27,Làm giàu đất nước, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=9&Title=Làm giàu đất nước, 1, 0
        d25af1db-40bb-4814-96ac-8a44ad6db696,6fb6a19c-74ac-45da-be34-323ab6403b27,Hôn nhân & Gia đình, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=10&Title=Hôn nhân & Gia đình, 1, 1
        cbf59eb5-0672-4201-91cb-174fa380beac,6fb6a19c-74ac-45da-be34-323ab6403b27,Công phu & Sáng tạo, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=11&Title=Công phu & Sáng tạo, 1, 0
        6cc48b90-8e13-4f36-a138-3ba742cfd69c,6fb6a19c-74ac-45da-be34-323ab6403b27,Nghệ thuật sống, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=12&Title=Nghệ thuật sống, 1, 0
        b5eb27e5-ab8d-4016-9ee2-69021b18ad3b,6fb6a19c-74ac-45da-be34-323ab6403b27,Thuật kinh doanh, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=13&Title=Thuật kinh doanh, 1, 0
        f13a2593-1c95-44d8-9387-8a096bdce7b5,6fb6a19c-74ac-45da-be34-323ab6403b27,Giải đáp pháp luật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=14&Title=Giải đáp pháp luật, 1, 0
        f0fcb2cc-351f-4628-94aa-cc35d6be17b6,6fb6a19c-74ac-45da-be34-323ab6403b27,ABC kinh tế, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=15&Title=ABC kinh tế, 1, 0
        2a6b1526-621c-4fcd-b515-38579dd40985,6fb6a19c-74ac-45da-be34-323ab6403b27,Học báo tiếng Anh, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=16&Title=Học báo tiếng Anh, 1, 0
        2a1170d2-51fb-440d-97ba-061a176370ef,6fb6a19c-74ac-45da-be34-323ab6403b27,Giới tính & Sức khỏe, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=17&Title=Giới tính & Sức khỏe, 1, 0
        f2ced884-4028-4a75-b05d-281bca0a6e1e,6fb6a19c-74ac-45da-be34-323ab6403b27,Văn hóa & Đời sống, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=18&Title=Văn hóa & Đời sống, 1, 0
        03656a12-940e-4de4-8500-d486ceb7aa9c,6fb6a19c-74ac-45da-be34-323ab6403b27,Nhân vật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=19&Title=Nhân vật, 1, 0
        d1e871f2-3aec-4b6d-a9a5-226cb08b1002,6fb6a19c-74ac-45da-be34-323ab6403b27,Đất nước mến yêu, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=20&Title=Đất nước mến yêu, 1, 0
        8d95c1f9-1740-4aca-9ddb-12347ba76dcd,6fb6a19c-74ac-45da-be34-323ab6403b27,Cảo thơm, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=21&Title=Cảo thơm, 1, 0
        f68f8a01-5319-4050-9c22-6a651fad9048,6fb6a19c-74ac-45da-be34-323ab6403b27,Thơ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=22&Title=Thơ, 1, 0
        a586066f-36d9-4988-b90a-7c9e7eef675e,6fb6a19c-74ac-45da-be34-323ab6403b27,Tạp bút, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=23&Title=Tạp bút, 1, 0
        a17f9f21-6e61-4180-9e15-aafa4fbae888,6fb6a19c-74ac-45da-be34-323ab6403b27,Truyện ngắn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=24&Title=Truyện ngắn, 1, 0
        847deb5d-9d93-4e78-a94c-98f24b44e572,6fb6a19c-74ac-45da-be34-323ab6403b27,Truyện ngắn 100 chữ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=25&Title=Truyện ngắn 100 chữ, 1, 0
        5ed295e1-9008-4f09-85e2-d109d5e10564,6fb6a19c-74ac-45da-be34-323ab6403b27,Tản mạn chuyện võ lâm, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=26&Title=Tản mạn chuyện võ lâm, 1, 0
        8a5f924d-b709-4493-a645-1c07c9fb71eb,6fb6a19c-74ac-45da-be34-323ab6403b27,Sự kiện nổi bật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=27&Title=Sự kiện nổi bật, 1, 0
        5e298acb-0995-46b7-b7fa-bd955d5c14a1,6fb6a19c-74ac-45da-be34-323ab6403b27,Chuyện đọc đêm khuya, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=30&Title=Chuyện đọc đêm khuya, 1, 0
        55a96cb6-643b-47fa-95e7-7f4a928b9fcb,6fb6a19c-74ac-45da-be34-323ab6403b27,Thư tòa soạn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=32&Title=Thư tòa soạn, 1, 0
        1cb64e0c-76e3-4388-b8b5-e3047d449c68,6fb6a19c-74ac-45da-be34-323ab6403b27,Kết bạn học tập, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=33&Title=Kết bạn học tập, 1, 0
        c8bbdbc6-3823-481c-92a4-6391a30993a3,6fb6a19c-74ac-45da-be34-323ab6403b27,Câu chuyện thời sự, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=34&Title=Câu chuyện thời sự, 1, 0
        bba9eb9a-02d0-4edb-8aae-1a805e810cb6,6fb6a19c-74ac-45da-be34-323ab6403b27,Trà dư tửu hậu, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=35&Title=Trà dư tửu hậu, 1, 0
        5a77a2ad-1e18-46d8-a01a-dc0dc5928b88,6fb6a19c-74ac-45da-be34-323ab6403b27,Sài Gòn xưa và nay, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=36&Title=Sài Gòn xưa và nay, 1, 0
        ecb53a57-3dc7-45ee-a6e6-a777e9e256f3,6fb6a19c-74ac-45da-be34-323ab6403b27,Tin vắn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=37&Title=Tin vắn, 1, 0
        c8be892e-962b-42be-9618-e857706f0c9f,6fb6a19c-74ac-45da-be34-323ab6403b27,Xem tranh qua lời bình, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=38&Title=Xem tranh qua lời bình, 1, 0
        75dddb34-b582-478d-bb6e-e097eb9ee3cd,6fb6a19c-74ac-45da-be34-323ab6403b27,Gương khởi nghiệp, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=39&Title=Gương khởi nghiệp, 1, 0
        66dc8c0b-673a-407a-a31f-e8ae3a9dcf03,6fb6a19c-74ac-45da-be34-323ab6403b27,Phiếm đàm, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=40&Title=Phiếm đàm, 1, 0
        12ec5caa-1c0b-4984-a4e7-52abe73e9a22,6fb6a19c-74ac-45da-be34-323ab6403b27,Nhịp sống Sài Gòn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=41&Title=Nhịp sống Sài Gòn, 1, 0
        1ebd2a3b-a76e-4d27-b348-ae524ad49ec6,6fb6a19c-74ac-45da-be34-323ab6403b27,Sức khỏe của bạn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=42&Title=Sức khỏe của bạn, 1, 0
        f73a5f27-b4bd-46fa-a2d9-e73e51090e66,6fb6a19c-74ac-45da-be34-323ab6403b27,Tin tức cười, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=43&Title=Tin tức cười, 1, 0
        a67c7e4e-0e51-460e-be66-e5e31439684e,6fb6a19c-74ac-45da-be34-323ab6403b27,Vui...cười, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=45&Title=Vui...cười, 1, 0
        aedfcbff-6712-400f-b59f-68223679c175,6fb6a19c-74ac-45da-be34-323ab6403b27,Thời trang - Làm đẹp, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=47&Title=Thời trang - Làm đẹp, 1, 0
        70a23121-046e-4af3-b8f1-ef88ce99f54d,6fb6a19c-74ac-45da-be34-323ab6403b27,Bạn có biết?, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=48&Title=Bạn có biết?, 1, 0
    ba9c4c47-7773-441e-8209-5f8079e4af3c,6fb6a19c-74ac-45da-be34-323ab6403b27,Chùm ảnh vui, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=50&Title=Chùm ảnh vui, 1, 0
        6209404b-35ff-4df1-bccd-4f58d73b5e75,6fb6a19c-74ac-45da-be34-323ab6403b27,Đọc báo tiếng Anh, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=51&Title=Đọc báo tiếng Anh, 1, 0
        6d5261f9-ec85-400e-82c1-fe337b4da586,6fb6a19c-74ac-45da-be34-323ab6403b27,Hộp thư, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=52&Title=Hộp thư, 1, 0
        446b4a7f-064d-43cf-9756-f1f0e3056d3a,6fb6a19c-74ac-45da-be34-323ab6403b27,Sách báo mới, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=53&Title=Sách báo mới, 1, 0
        b6288685-ee71-475b-8f82-adf0f7ff7be4,6fb6a19c-74ac-45da-be34-323ab6403b27,Tin học & Ứng dụng, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=83&Title=Tin học & Ứng dụng, 1, 0
        f298c393-718e-4626-8569-7fb15ec03f49,6fb6a19c-74ac-45da-be34-323ab6403b27,Khoa học kỳ thú, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=55&Title=Khoa học kỳ thú, 1, 0
        0d4a6956-0ac3-4b0d-8541-4b471bd3ce3b,6fb6a19c-74ac-45da-be34-323ab6403b27,Thế giới kỳ thú, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=56&Title=Thế giới kỳ thú, 1, 0
        e63a7e32-08d0-48ff-b095-037a612f8e8a,6fb6a19c-74ac-45da-be34-323ab6403b27,Nghệ thuật đương đại Việt Nam, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=87&Title=Nghệ thuật đương đại Việt Nam, 1, 0
        0ba160c9-47cd-490f-b943-a2935ac07310,6fb6a19c-74ac-45da-be34-323ab6403b27,Hỏi gì đáp nấy, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=71&Title=Hỏi gì đáp nấy, 1, 0
        99291201-e377-428e-81ff-c35c67f9eb3e,6fb6a19c-74ac-45da-be34-323ab6403b27,Kinh tế - xã hội, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=63&Title=Kinh tế - xã hội, 1, 0
        5011c9bd-1eb0-4c96-817c-01a5eea45244,6fb6a19c-74ac-45da-be34-323ab6403b27,Nghiên cứu lịch sử, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=57&Title=Nghiên cứu lịch sử, 1, 0
        7cb44dc6-2fa4-45b2-b99c-d08c7aa38d9c,6fb6a19c-74ac-45da-be34-323ab6403b27,Tản mạn, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=58&Title=Tản mạn, 1, 0
        ea5e44dc-265f-4b51-9278-dfaeaa754b25,6fb6a19c-74ac-45da-be34-323ab6403b27,Điện ảnh, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=59&Title=Điện ảnh, 1, 0
        a2db38e1-9c68-4955-a562-bdcde8afc510,6fb6a19c-74ac-45da-be34-323ab6403b27,Khó tin nhưng có thật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=60&Title=Khó tin nhưng có thật, 1, 0
        3d5806b0-7ab9-4c37-9588-dae7734d4a31,6fb6a19c-74ac-45da-be34-323ab6403b27,Hồ sơ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=61&Title=Hồ sơ, 1, 0
        4250a2a4-af69-4bea-b00d-86500c75e3f9,6fb6a19c-74ac-45da-be34-323ab6403b27,Phim hài, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=72&Title=Phim hài, 1, 0
        6e319232-62d5-4060-b5c3-3b969bc09b2b,6fb6a19c-74ac-45da-be34-323ab6403b27,Thế giới động vật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=64&Title=Thế giới động vật, 1, 0
        f02c0e35-9b79-4fa5-b27b-7b8908d268d0,6fb6a19c-74ac-45da-be34-323ab6403b27,Hương vị quê hương, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=66&Title=Hương vị quê hương, 1, 0
        5077b97d-b0b4-49e8-b036-ea41608737f3,6fb6a19c-74ac-45da-be34-323ab6403b27,Ghi chép, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=67&Title=Ghi chép, 1, 0
        43889a6b-813d-4f54-af6d-0bb03bd34d46,6fb6a19c-74ac-45da-be34-323ab6403b27,Suy ngẫm, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=68&Title=Suy ngẫm, 1, 0
        7cbb82f2-4f4a-4908-84c2-8a7561091bbc,6fb6a19c-74ac-45da-be34-323ab6403b27,Y học & Đời sống, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=69&Title=Y học & Đời sống, 1, 0
        f2fe4cb1-51f8-4856-9b9c-e9993a51357d,6fb6a19c-74ac-45da-be34-323ab6403b27,Du lịch, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=70&Title=Du lịch, 1, 0
        2ddaf5eb-f106-4b45-a0b3-6319291961c7,6fb6a19c-74ac-45da-be34-323ab6403b27,Nhìn ra thế giới, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=73&Title=Nhìn ra thế giới, 1, 0
        955041c2-eec8-4c74-a441-852239200ee0,6fb6a19c-74ac-45da-be34-323ab6403b27,Ảnh nghệ thuật, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=74&Title=Ảnh nghệ thuật, 1, 0
        b45b7f37-3938-42ee-8501-45a844b455c8,6fb6a19c-74ac-45da-be34-323ab6403b27,Sổ tay người ngoạn cổ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=75&Title=Sổ tay người ngoạn cổ, 1, 0
        8d7cc1c4-0526-4b25-9b6e-a6cf5d65183b,6fb6a19c-74ac-45da-be34-323ab6403b27,Thể thao, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=76&Title=Thể thao, 1, 1
        8632da17-5fb6-4c48-996e-a29068555bf4,6fb6a19c-74ac-45da-be34-323ab6403b27,Pháp luật & Đời sống, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=77&Title=Pháp luật & Đời sống, 1, 0
        7c2328e7-1bb5-4888-866d-04deb023967f,6fb6a19c-74ac-45da-be34-323ab6403b27,Lá thư hải ngoại, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=79&Title=Lá thư hải ngoại, 1, 0
        4ea92190-76b1-4867-8108-c62a2255d3a4,6fb6a19c-74ac-45da-be34-323ab6403b27,Giáo dục, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=80&Title=Giáo dục, 1, 0
        3f94ffcb-dc33-4bc3-9c6d-29a02e614468,6fb6a19c-74ac-45da-be34-323ab6403b27,Ký sự đường xa, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=81&Title=Ký sự đường xa, 1, 0
        61cfb152-aaad-41ed-8a1f-dfa053111ec2,6fb6a19c-74ac-45da-be34-323ab6403b27,Chuyện văn nghệ sĩ, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=82&Title=Chuyện văn nghệ sĩ, 1, 1
        e4d2ed05-1a5c-4444-9851-bc770b2bda8d,6fb6a19c-74ac-45da-be34-323ab6403b27,Thế giới Games, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=84&Title=Thế giới Games, 1, 0
        9133ebc0-a937-4557-bdc7-519c0f070c46,6fb6a19c-74ac-45da-be34-323ab6403b27,Dế di động, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=85&Title=Dế di động, 1, 0
        c52566e5-f97a-4994-ae2d-0a3f02e5987d,6fb6a19c-74ac-45da-be34-323ab6403b27,Thế giới Ô tô, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=86&Title=Thế giới Ô tô, 1, 0
        58f3a6d6-7469-4d24-b8c5-236ccd36c5ef,6fb6a19c-74ac-45da-be34-323ab6403b27,Khuyến mãi & Mua sắm, http://kienthucngaynay.info/am/RSS/rss_news_pro.php?id=88&Title=Khuyến mãi & Mua sắm, 1, 0
        54d30bd8-6b43-458f-827e-d0a8ac7738c3,	6fb6a19c-74ac-45da-be34-323ab6403b27,10 bài viết mới nhất trong Diễn đàn, http://kienthucngaynay.info/am/RSS/rssforum-full.php, 1, 0
        4fec5176-dc3f-40c5-911f-cb8c0134867e,	6fb6a19c-74ac-45da-be34-323ab6403b27,10 File mới được đưa lên trong Thư viện phần mềm, http://kienthucngaynay.info/am/RSS/rssfiles.php, 1, 0
        93582c7e-a137-470b-ad5d-311efc4198d0,	6fb6a19c-74ac-45da-be34-323ab6403b27,10 Website mới nhất trong Thư viện Web, http://kienthucngaynay.info/am/RSS/rssthuvienweb.php, 1, 0
        563c1cc5-8cc2-4e6f-a809-3623fdb2a175,	6fb6a19c-74ac-45da-be34-323ab6403b27,10 Mặt hàng mới nhất trong QCRV, http://kienthucngaynay.info/am/RSS/rssquangcao-raovat-pro.php, 1, 0
        59a2b6b2-79f6-4db4-94ab-bff49e261c6d, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Trang chủ, http://cafebiz.vn/trang-chu.rss, 1, 1
        5ee83539-3209-48ca-ab41-4469c443abdb, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Câu chuyện kinh doanh, http://cafebiz.vn/cau-chuyen-kinh-doanh.rss, 1, 1
        f07f5750-fba1-4eed-9741-0a745dedf4b2, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Nhân vật,http://cafebiz.vn/nhan-vat.rss, 1, 1
        3aba847e-6ba7-497b-b900-43caf5cda121, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Phong cách,http://cafebiz.vn/phong-cach.rss, 1, 0
        f056ad13-c951-43a8-9983-8ac385b647f1, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Xu hướng công nghệ,http://cafebiz.vn/xu-huong-cong-nghe.rss, 1, 1
        67ae8eae-f9c8-47e0-abde-b284605b077a, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Quản trị,http://cafebiz.vn/quan-tri.rss, 1, 0
        ae0198a3-7a5d-462d-99bd-d6dc7ceb1118, 890d1e54-8298-4fc4-ba10-2c8b494245cb, Sách,http://cafebiz.vn/sach.rss, 1, 0,
        9d183c0c-5236-4bbf-8f6f-c901a26e581c,074c83f9-2707-47d4-97ff-0de3985e92b3, Trang chủ, http://cafef.vn/Trang-chu.rss, 1,1
        b84dd60e-d9d4-4be4-8806-434b91872981,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức mới nhất, http://cafef.vn/Tin-moi.rss, 1,0
        b4d8b8be-35c7-48ec-b138-dd324bb165e5,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức thị trường chứng khoán, http://cafef.vn/Thi-truong-chung-khoan.rss, 1,1
        e969913e-2a98-411e-a344-f98779abf39e,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức bất động sản, http://cafef.vn/Bat-dong-san.rss, 1,0
        8f7cf8f1-ae04-4be7-8820-8a6bd41841fd,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức doanh nghiệp, http://cafef.vn/Doanh-nghiep.rss, 1,0
        d1cd61d2-1a96-40d1-9dda-9038188b0013,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức tài chính - ngân hàng, http://cafef.vn/Tai-chinh-ngan-hang.rss, 1,1
        38086837-0fcb-4b04-afef-6fd5679e9a2a,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin tức tài chính quốc tế, http://cafef.vn/Tai-chinh-quoc-te.rss, 1,0
        853b2ce0-d960-461a-9ab1-713e97d7258b,074c83f9-2707-47d4-97ff-0de3985e92b3, Kinh tế vĩ mô, http://cafef.vn/Kinh-te-vi-mo.rss, 1,0
        bd3c18c9-fa7a-4bc4-b5e4-d5167ef83686,074c83f9-2707-47d4-97ff-0de3985e92b3, Hàng hóa - Nguyên liệu, http://cafef.vn/Hang-hoa-nguyen-lieu.rss, 1,0
        7d50f5e4-9c34-4620-8fe5-8eb5b2ff65e8,074c83f9-2707-47d4-97ff-0de3985e92b3, Doanh nhân, http://cafef.vn/Doanh-nhan.rss, 1,1
        4e4ea8e9-ffe1-4dea-a128-537f53765856,074c83f9-2707-47d4-97ff-0de3985e92b3, Hội nghị hội thảo, http://cafef.vn/Hoi-nghi-hoi-thao.rss, 1,0
        d671130d-cf4a-43be-a7bf-9193fbaa0a61,074c83f9-2707-47d4-97ff-0de3985e92b3, Doanh nghiệp giới thiệu, http://cafef.vn/Doanh-nghiep-gioi-thieu.rss, 1,0
        36f68a23-0767-464e-b242-ba491d14c821,074c83f9-2707-47d4-97ff-0de3985e92b3, Lịch sự kiện thị trường, http://cafef.vn/Lich-su-kien.rss, 1,0
        8950fdf3-c64b-4aac-a8e5-26af8b598159,074c83f9-2707-47d4-97ff-0de3985e92b3, Tin doanh nghiệp niêm yết, http://cafef.vn/Tin-doanh-nghiep.rss, 1,0
        694a4454-515c-474b-8ef3-bd4155197101,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Trang chủ,http://www.doisongphapluat.com/trang-chu.rss,1,1
        21d58760-d948-4df2-a0b4-d426acdfb55a,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Widget,http://www.doisongphapluat.com/widget.rss,1,0
        bf0d4b8a-9177-447f-8888-57a67a09fb82,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Video,http://www.doisongphapluat.com/video.rss,1,0
        d3d0db80-667a-4adb-8471-4ac708907e65,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tin tức,http://www.doisongphapluat.com/rss/tin-tuc.rss,1,0
        2da83c8c-2a3a-4c6e-bf6d-a5cc86e77ad5,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Sự kiện hàng ngày,http://www.doisongphapluat.com/rss/tin-tuc/su-kien-hang-ngay.rss,1,0
        2cb2df57-492b-4106-87e6-4a7c54eabaf0,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Cuộc thi viết,http://www.doisongphapluat.com/rss/cuoc-thi-viet.rss,1,0
        1bd4cfed-dd5d-42a2-8a2d-86af12db00cd,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Xã hội,http://www.doisongphapluat.com/rss/xa-hoi.rss,1,0
        3f86b9fb-953d-4121-8d65-b755b709337e,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Địa phương,http://www.doisongphapluat.com/rss/dia-phuong.rss,1,0
        d3290d48-3442-492c-9ab2-dc872f66fead,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Miền Bắc,http://www.doisongphapluat.com/rss/dia-phuong/mien-bac.rss,1,0
        b4c1dc59-96bb-44d2-aaa9-27b0926461af,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Miền Trung,http://www.doisongphapluat.com/rss/dia-phuong/mien-trung.rss,1,0
        4f7d3661-93ca-48c8-ab31-040c56316dac,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Miền Nam,http://www.doisongphapluat.com/rss/dia-phuong/mien-nam.rss,1,0
        6b378698-30f4-419b-bef2-3462af4e5d02,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tây Nguyên,http://www.doisongphapluat.com/rss/dia-phuong/tay-nguyen.rss,1,0
        7d2c38db-6f9c-4d92-8a72-81c97f3b8722,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tin pháp luật,http://www.doisongphapluat.com/rss/dia-phuong/tin-phap-luat.rss,1,1
        bfe0525d-7ff7-4238-8fba-9a90db972fce,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tổ quốc xanh,http://www.doisongphapluat.com/rss/to-quoc-xanh.rss,1,0
        a3b4ab98-9cd8-4a21-9b8c-c1b60df90013,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Khám phá,http://www.doisongphapluat.com/rss/to-quoc-xanh/kham-pha.rss,1,0
        9c59c303-73cf-4fa0-89df-03e793fc8464,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Chủ quyền,http://www.doisongphapluat.com/rss/to-quoc-xanh/chu-quyen.rss,1,0
        fa867226-e8cd-4ab4-a89e-b172933a50d2,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tài nguyên,http://www.doisongphapluat.com/rss/to-quoc-xanh/tai-nguyen.rss,1,0
        ad1d4bf5-8d9d-4da4-92d7-6fcab3b9194d,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Nóng trong tuần,http://www.doisongphapluat.com/rss/to-quoc-xanh/nong-trong-tuan.rss,1,0
        d2cbc16a-37ec-48ad-8015-3f97f68a4206,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Video Clip,http://www.doisongphapluat.com/rss/to-quoc-xanh/video-clip.rss,1,0
        75a6f458-1f73-4284-a6de-0959d3b3a358,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Pháp luật,http://www.doisongphapluat.com/rss/phap-luat.rss,1,0
        4087cb48-fdf2-4997-b3b7-37b49af78a99,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,An ninh - Hình sự,http://www.doisongphapluat.com/rss/phap-luat/an-ninh-hinh-su.rss,1,0
        b1bccb45-975d-43db-90bd-deab0e823f88,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Nghi án - Điều tra,http://www.doisongphapluat.com/rss/phap-luat/nghi-an-dieu-tra.rss,1,0
        3d32eca5-fdbf-4d18-a5ff-8f59d49cd4b1,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Hồ sơ vụ án,http://www.doisongphapluat.com/rss/phap-luat/ho-so-vu-an.rss,1,0
        1d513c81-7fd9-449d-a441-4efd328837fd,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Luật sư,http://www.doisongphapluat.com/rss/phap-luat/luat-su.rss,1,0
        c8e74383-e8d6-465f-a08a-105b1438362f,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Hội Luật Gia,http://www.doisongphapluat.com/rss/phap-luat/hoi-luat-gia.rss,1,0
        8e258cf5-30b4-4f3f-9267-2606c342033c,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Văn bản pháp luật,http://www.doisongphapluat.com/rss/phap-luat/van-ban-phap-luat.rss,1,0
        0f9c5549-5298-4bd7-8327-0ba0de811720,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Án xưa,http://www.doisongphapluat.com/rss/phap-luat/an-xua.rss,1,0
        f23c1eb9-badd-43cb-9dc3-124054844bcb,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Bạn đọc,http://www.doisongphapluat.com/rss/phap-luat/ban-doc.rss,1,0
        f722dc0c-dbbc-4b96-8f7c-56bb0aabc1db,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Đời sống,http://www.doisongphapluat.com/rss/doi-song.rss,1,1
        4c06acab-74e2-4832-8182-4f264ab9c5af,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Gia đình,http://www.doisongphapluat.com/rss/gia-dinh.rss,1,1
        6c59ae16-0eb7-4c82-9fbc-d635b6d9bbb3,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Công sở,http://www.doisongphapluat.com/rss/doi-song/cong-so.rss,1,0
        1637167d-63cf-477d-aabf-9b60436b90c7,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tình yêu - Giới tính,http://www.doisongphapluat.com/rss/doisong/tinh-yeu-gioi-tinh.rss,1,0
        45547c24-8700-4e00-94a0-875a8403b70c,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Giới trẻ,http://www.doisongphapluat.com/rss/gioi-tre.rss,1,0
        e7511890-0fdd-42b6-9fe2-d078af4af6f8,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Sức khoẻ,http://www.doisongphapluat.com/rss/doi-song/suc-khoe.rss,1,0
        8ddac34b-9d1c-40d2-aa0f-0a0e0a71b729,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Ăn - Chơi,http://www.doisongphapluat.com/rss/doi-song/an-choi.rss,1,0
        b815286f-de00-4d28-9315-41930d230585,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Ẩm thực,http://www.doisongphapluat.com/rss/doi-song/am-thuc.rss,1,0
        16470ab0-7d1b-4f49-b9d8-0b4633ec1803,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Cộng đồng mạng,http://www.doisongphapluat.com/rss/cong-dong-mang.rss,1,0
        44aadf4b-4e8f-4895-bcca-c82c7d1a17aa,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Chi tiêu,http://www.doisongphapluat.com/rss/doi-song/chi-tieu.rss,1,0
        ab08cee8-418a-48ce-8d8d-72ea95f188a3,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tâm sự,http://www.doisongphapluat.com/rss/doi-song/tam-su.rss,1,0
        1419928c-4ae6-42aa-92c2-a9e955f52a71,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thế giới,http://www.doisongphapluat.com/rss/the-gioi.rss,1,0
        599f3d63-2ad7-4160-9f46-9a7466134f4a,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thế giới 24h,http://www.doisongphapluat.com/rss/the-gioi/the-gioi-24h.rss,1,0
        6b219c20-4b8b-4426-8d23-731113e32474,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Quân sự,http://www.doisongphapluat.com/rss/the-gioi/quan-su.rss,1,0
        e5d3b18b-a53e-425d-82dd-a12bcb032c27,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Bình luận,http://www.doisongphapluat.com/rss/the-gioi/binh-luan.rss,1,0
        f6fa2e87-a522-4c61-8213-d1f9c35cc2a5,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Hồ sơ,http://www.doisongphapluat.com/rss/the-gioi/ho-so.rss,1,0
        a74d11ca-4c8c-4f89-b04d-9de9c50560f4,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Chuyện lạ,http://www.doisongphapluat.com/rss/the-gioi/chuyen-la.rss,1,0
        482206b1-330b-4322-9d49-aa14aedac957,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Công nghệ,http://www.doisongphapluat.com/rss/cong-nghe.rss,1,0
        04aebaee-be2c-46c8-ad4e-6041041d9736,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Internet & Web,http://www.doisongphapluat.com/rss/cong-nghe/internet.rss,1,0
        438443bd-1459-498d-a8f8-40b5dfdc558e,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Sản phẩm số,http://www.doisongphapluat.com/rss/cong-nghe/san-pham-so.rss,1,0
        2292ace8-d8f7-42a0-b199-58df68d9b38a,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Kinh doanh,http://www.doisongphapluat.com/rss/kinh-doanh.rss,1,0
        3ed827a1-3dc9-48d9-b8bf-320b9bfa9902,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thị trường,http://www.doisongphapluat.com/rss/kinh-doanh/thi-truong.rss,1,0
        01ec4a22-e49e-41ab-a4c7-d733a7cba7ee,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Doanh nghiệp,http://www.doisongphapluat.com/rss/kinh-doanh/doanh-nghiep.rss,1,0
        a189c3ff-92eb-48ba-aae0-7f00ad9decf3,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Doanh nhân,http://www.doisongphapluat.com/rss/kinh-doanh/doanh-nhan.rss,1,0
        c759bcf4-1c37-4cc1-b871-caf4c5a5d6dd,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Khởi nghiệp,http://www.doisongphapluat.com/rss/kinh-doanh/khoi-nghiep.rss,1,0
        e55f6486-1b26-4daf-b077-165469aef245,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Bất động sản,http://www.doisongphapluat.com/rss/kinh-doanh/bat-dong-san.rss,1,0
        233c40b1-54b5-49ea-9d86-3084ac14e56c,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tài chính - Ngân hàng,http://www.doisongphapluat.com/rss/kinh-doanh/tai-chinh-ngan-hang.rss,1,0
        38d177fc-6e5c-4c64-b6b7-59eae5fa4ff4,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Giải trí,http://www.doisongphapluat.com/rss/giai-tri.rss,1,0
        09df6e4c-da83-4019-a574-e9d167435f79,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Ngôi Sao,http://www.doisongphapluat.com/rss/giai-tri/ngoi-sao.rss,1,0
        afd95db6-e330-43e6-a5b1-cd1a2445b95b,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Âm nhạc,http://www.doisongphapluat.com/rss/giai-tri/am-nhac.rss,1,0
        7a77136e-306f-4e29-a5ef-8de03387c539,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Phim Ảnh,http://www.doisongphapluat.com/rss/giai-tri/phim.rss,1,0
        1aa1ab2b-e062-403e-8760-e033f5ea9a9e,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Truyền Hình,http://www.doisongphapluat.com/rss/giai-tri/truyen-hinh.rss,1,0
        38b33a74-0619-4626-98b6-ffd25a54ecb3,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Vui - Cười,http://www.doisongphapluat.com/rss/giai-tri/vui-cuoi.rss,1,0
        3e032c99-d9cd-42ea-8485-30e9cebcfffe,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thời trang & Làm đẹp,http://www.doisongphapluat.com/rss/thoi-trang.rss,1,0
        c182da69-9774-4458-8e61-6f5303351f38,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Du lịch,http://www.doisongphapluat.com/rss/giai-tri/du-lich.rss,1,0
        2b301360-4d87-4e0c-ae33-b204e8329080,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Giáo dục,http://www.doisongphapluat.com/rss/giao-duc.rss,1,0
        aae6e8ad-1d65-4aa5-b7c2-133acbab88d5,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tuyển sinh,http://www.doisongphapluat.com/rss/giao-duc/tuyen-sinh.rss,1,0
        4ba25919-47b9-444b-a0a8-c9e294c95ad9,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Du học,http://www.doisongphapluat.com/rss/giao-duc/du-hoc.rss,1,0
        0fe04173-21dc-4742-a46d-5e70ab504f67,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Chuyện học đường,http://www.doisongphapluat.com/rss/giao-duc/chuyen-hoc-duong.rss,1,0
        a63f499a-4749-43bb-bc46-656b64129a55,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Đáp án đề thi tốt nghiệp THPT,http://www.doisongphapluat.com/rss/giao-duc/dap-an-de-thi-tot-nghiep-thpt.rss,1,0
        05c8c10d-5d06-4dc9-86de-24170970caeb,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Đáp án đề thi ĐH,http://www.doisongphapluat.com/rss/giao-duc/dap-an-de-thi-dh.rss,1,0
        c4610f84-1223-44d1-a7a7-fad6a804793f,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thể thao,http://www.doisongphapluat.com/rss/the-thao.rss,1,0
        f614be5a-5980-4ed4-ad8e-d8144431ba92,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Bóng đá,http://www.doisongphapluat.com/rss/the-thao/bong-da.rss,1,0
        c5a91457-9027-457d-bebb-b3fedf99a66f,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Golf,http://www.doisongphapluat.com/rss/golf.rss,1,0
        e9be5c29-c62b-4276-aa3d-ec03f5441750,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Quần vợt,http://www.doisongphapluat.com/rss/the-thao/quan-vot.rss,1,0
        0cefaba1-f1b6-4290-8a62-b6c2dd4446d9,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Hậu trường,http://www.doisongphapluat.com/rss/the-thao/hau-truong.rss,1,0
        3df34cb4-b5c2-46e1-bae0-bbda28339269,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,SEA Games 27,http://www.doisongphapluat.com/rss/the-thao/sea-games-27.rss,1,0
        50d99c86-6d0f-42bb-bf11-20c5b1404039,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,World Cup 2014,http://www.doisongphapluat.com/rss/the-thao/world-cup-2014.rss,1,0
        2ec0816b-90f7-4e40-a20a-0a07772a7230,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Ôtô - Xe máy,http://www.doisongphapluat.com/rss/oto-xemay.rss,1,0
        b9180784-6144-485c-9e62-74d3011ac446,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thế giới Xe,http://www.doisongphapluat.com/rss/oto-xemay/the-gioi-xe.rss,1,0
        0cbe7c03-7dc0-496a-9764-48c0aabdd278,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Thị trường,http://www.doisongphapluat.com/rss/oto-xemay/thi-truong.rss,1,0
        5f5429e3-d032-4475-8bab-97b9e00b8fef,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tư vấn,http://www.doisongphapluat.com/rss/oto-xemay/tu-van.rss,1,0
        24d8ea5e-3db7-41cd-87e2-f34f346efc71,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Cần biết,http://www.doisongphapluat.com/rss/can-biet.rss,1,0
        02d3fede-0cda-4883-87e9-3b830a619dd1,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Tài chính - Doanh nghiệp,http://www.doisongphapluat.com/rss/can-biet/tai-chinh-doanh-nghiep.rss,1,0
        bef193de-9e8e-4274-8d7e-acc67550a195,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Giáo dục - Hướng nghiệp,http://www.doisongphapluat.com/rss/can-biet/giao-duc-huong-nghiep.rss,1,0
        7edf5199-be3a-4868-ba4c-88cbac19bf23,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Truyền thông - Thương hiệu,http://www.doisongphapluat.com/rss/can-biet/truyen-thong-thuong-hieu.rss,1,0
        349061fe-a2b7-4ce3-bd8f-ee09de3c528b,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Sản phẩm - Dịch vụ,http://www.doisongphapluat.com/rss/can-biet/san-pham-dich-vu.rss,1,0
        c27c994b-a966-49d6-8e8b-5ad3d5469445,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Y tế sức khỏe,http://www.doisongphapluat.com/rss/can-biet/y-te-suc-khoe.rss,1,0
        a0d68901-0b27-44e7-a82b-0ac87d58dea6,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Từ thiện,http://www.doisongphapluat.com/rss/tu-thien.rss,1,0
        68a5f3d9-e9d0-4097-906a-f2d014436cf7,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Hoàn cảnh,http://www.doisongphapluat.com/rss/tu-thien/hoan-canh.rss,1,0
        07a6d9a7-d6f1-4376-8864-3eb343d577e9,b60df1ad-4a0d-48d2-bbaf-d328ef00067a,Sống đẹp,http://www.doisongphapluat.com/rss/tu-thien/song-dep.rss,1,0
        c07602cd-b843-490d-9c52-a3aa5529734d, 59c5f421-6e68-4641-9d54-de145a4ae66f, Trang chủ, http://www.tinhte.vn/rss/, 1,1
        b7a37de4-465a-44f3-b9b3-72f556564903, 455b6156-77ba-4023-a057-9c06c7f60849, Trang chủ, http://2sao.vn/rss/trangchu.rss, 1,1
        7a2fcf1d-e359-497b-ae86-4ec80d3bf853, 455b6156-77ba-4023-a057-9c06c7f60849, Sao, http://2sao.vn/rss/sao.rss, 1,1
        29f4b0a9-cd49-4c58-a43b-a8efb6096cc9, 455b6156-77ba-4023-a057-9c06c7f60849, Âm nhạc,http://2sao.vn/rss/amnhac.rss, 1,0
        896ad11e-1db6-42ea-9afe-67456f92eb88, 455b6156-77ba-4023-a057-9c06c7f60849, Phim,http://2sao.vn/rss/phim.rss, 1,0
        36221c2e-323a-4fa7-8c0a-efc197cc2b14, 455b6156-77ba-4023-a057-9c06c7f60849, Alo2Sao,http://2sao.vn/rss/hoidap.rss, 1,0
        931119e3-1e7c-40b2-9245-142788a0c7be, 455b6156-77ba-4023-a057-9c06c7f60849, Sự kiện xã hội,http://2sao.vn/rss/sukien.rss, 1,0
        79549cb5-1f90-4b0e-abdb-5d4d855c2914, 455b6156-77ba-4023-a057-9c06c7f60849, Đời sống giới trẻ,http://2sao.vn/rss/doisong.rss, 1,0
        a417c78c-6d53-4d46-9658-bd9aa520e6e7, 455b6156-77ba-4023-a057-9c06c7f60849, Công nghệ,http://2sao.vn/rss/congnghe.rss, 1,0
        d1d25d63-5377-4703-9d99-d631dd94e7f6, b99447ea-5c8b-4acb-8cc2-d6d215d4bf8d, Trang chủ, http://www.winphoneviet.com/?feed=rss2, 1, 1
        4d5827f7-504b-494b-9176-c3c5dd10cad8, 7b420408-13bf-4340-81f7-a6430c538686, Chính trị - Xã hội,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=3 ,1,1
        afc26a38-fc7d-442e-9271-fc44e6046b85, 7b420408-13bf-4340-81f7-a6430c538686,Sống khỏe,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=12 ,1,0
        b656cced-0a80-4bd1-aa50-142178522e88, 7b420408-13bf-4340-81f7-a6430c538686,Môi trường,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=17 ,1,0
        e903d74f-e408-4de4-9a0b-bd4f1b9cf6f7, 7b420408-13bf-4340-81f7-a6430c538686,Phóng sự - Ký sự,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=89 ,1,0
        ea43e397-945b-454d-a9b7-ee60bf731164, 7b420408-13bf-4340-81f7-a6430c538686,Pháp luật ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=6 ,1,0
        61f41e88-4a9c-4601-a9ca-81c2847e66bd, 7b420408-13bf-4340-81f7-a6430c538686,Ký sự pháp đình,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=266 ,1,0
        45e8f804-e2e1-471d-8301-d4e169822ce3, 7b420408-13bf-4340-81f7-a6430c538686,Vụ án,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=133 ,1,0
        66a0c752-ab0d-4cbc-968a-76345f594627, 7b420408-13bf-4340-81f7-a6430c538686,Thế giới ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=2 ,1,1
        3b9aabda-d101-40f1-81e3-b73badd04223, 7b420408-13bf-4340-81f7-a6430c538686,Quan sát-Bình luận,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=94 ,1,0
        e6cd563f-83cf-4f22-a274-38ebc195a3ba, 7b420408-13bf-4340-81f7-a6430c538686,Thế giới muôn màu,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=442 ,1,0
        bb9ef69e-6ad2-4f62-801b-2a2e35f55c1f, 7b420408-13bf-4340-81f7-a6430c538686,Người Việt xa quê,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=312 ,1,0
        c370f95b-6c4c-4200-b105-15186cffc92c, 7b420408-13bf-4340-81f7-a6430c538686,Kinh tế ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=11 ,1,0
        ff2705ad-38ed-45f6-8c62-ebd9f89e1704, 7b420408-13bf-4340-81f7-a6430c538686,Tiêu dùng,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=660 ,1,0
        cfc87c69-1b16-4335-a812-16efd69e5503, 7b420408-13bf-4340-81f7-a6430c538686,Tài chính,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=86 ,1,0
        ffd79a18-48b8-41fa-9d8a-2efddbfa1d9f, 7b420408-13bf-4340-81f7-a6430c538686,Doanh nhân,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=775 ,1,0
        bb8ad746-2032-45f6-b08d-ab483b8a9161, 7b420408-13bf-4340-81f7-a6430c538686,Thế giới xe,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=659 ,1,0
        d606b444-3a88-4fbe-ac9b-6c3a20d2f4e2, 7b420408-13bf-4340-81f7-a6430c538686,Thị trường,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=215 ,1,0
        6a05a368-6765-477c-b01f-1d3551af3e71, 7b420408-13bf-4340-81f7-a6430c538686,Giáo dục ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=13 ,1,0
        c4124141-ce42-4984-b4bd-5094a0ff1e96, 7b420408-13bf-4340-81f7-a6430c538686,Du học,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=85 ,1,0
        3b229d58-0531-4f52-a07e-4637cb72e795, 7b420408-13bf-4340-81f7-a6430c538686,Khoa học,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=661 ,1,0
        acdc71e0-1b83-4f83-80d5-efbe540f793e, 7b420408-13bf-4340-81f7-a6430c538686,Nhịp sống trẻ ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=7 ,1,0
        f483d0af-ba2f-4549-bbd5-994b63783ef5, 7b420408-13bf-4340-81f7-a6430c538686,Teen,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=560 ,1,0
        985e881b-53c5-4b5a-94bc-b5c8a5f07c17, 7b420408-13bf-4340-81f7-a6430c538686,Tình yêu - Lối sống,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=194 ,1,0
        8729c023-4a38-4a65-9ae9-128c956e60fc, 7b420408-13bf-4340-81f7-a6430c538686,Làm đẹp,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=365 ,1,0
        afb7443b-8a5e-4e82-975a-414372c6ecf9, 7b420408-13bf-4340-81f7-a6430c538686,Văn hóa-Giải trí,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=10 ,1,0
        5091645d-764a-467b-8839-c78f739f6e90, 7b420408-13bf-4340-81f7-a6430c538686,Điện ảnh,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=10 ,1,0
        5b570f2c-331c-4a10-8358-e9998fc27cc3, 7b420408-13bf-4340-81f7-a6430c538686,Sân khấu,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=10 ,1,0
        c0788969-450e-43af-ac02-b49eab460651, 7b420408-13bf-4340-81f7-a6430c538686,Giải trí hôm nay,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=10 ,1,0
        d8d673e4-cb7a-448b-901d-6ed175a61ece, 7b420408-13bf-4340-81f7-a6430c538686,Bạn đọc ,http://tuoitre.vn/Pages/RssFeeds.aspx?ChannelID=118 ,1,0
        9218f218-75dc-4237-8491-e2ce547ee7f7,67a3faf7-3ee4-4741-90f9-65713c37b261,Trang chủ,http://laodong.com.vn/rss/home.rss ,1,1
        3dee7536-d094-4a06-b086-167123db1b2c,67a3faf7-3ee4-4741-90f9-65713c37b261,Chính trị,http://laodong.com.vn/rss/chinh-tri-57.rss ,1,0
        79127391-48d3-4981-adad-32a46df8ba5a,67a3faf7-3ee4-4741-90f9-65713c37b261,Công đoàn,http://laodong.com.vn/rss/cong-doan-58.rss,1,0
        0c6bb214-047d-451c-970e-1cc27a54b690,67a3faf7-3ee4-4741-90f9-65713c37b261,Thế giới,http://laodong.com.vn/rss/the-gioi-62.rss,1,1
        122c60e4-2e09-40bc-bb9a-08b83b51df37,67a3faf7-3ee4-4741-90f9-65713c37b261,Xã hội,http://laodong.com.vn/rss/xa-hoi-59.rss,1,0
        ddc4edf8-de1c-4a32-a05c-d9c4c3987229,67a3faf7-3ee4-4741-90f9-65713c37b261,Kinh tế,http://laodong.com.vn/rss/kinh-te-63.rss,1,0
        68a63aa2-5f21-44ef-8b13-7eaf213ac666,67a3faf7-3ee4-4741-90f9-65713c37b261,Pháp luật,http://laodong.com.vn/rss/phap-luat-65.rss,1,0
        3e49146c-6adb-4fcc-be10-9b2a2d6a0e65,67a3faf7-3ee4-4741-90f9-65713c37b261,Thể thao,http://laodong.com.vn/rss/the-thao-60.rss,1,1
        4f3c232e-e1de-456f-9fa1-0932c674fd0d,67a3faf7-3ee4-4741-90f9-65713c37b261,Văn hóa,http://laodong.com.vn/rss/van-hoa-61.rss,1,0
        1d44c727-d875-45fe-87b4-457870584791,67a3faf7-3ee4-4741-90f9-65713c37b261,Khoa học - Công nghệ,http://laodong.com.vn/rss/khoa-hoc-cong-nghe-66.rss,1,0
        58b28bd5-a112-45e7-ab98-7ab552ac40e8,67a3faf7-3ee4-4741-90f9-65713c37b261,Diễn đàn,http://laodong.com.vn/rss/dien-dan-75.rss,1,0
        8b6f3b9e-842d-4e15-be5f-3c511eb7b98c,e200232a-7905-4d89-85a4-ef2f9e13be8a,Yan, http://yanner.yan.vn/forums/-/index.rss, 1,1
        7ce90a13-e79d-4289-aafb-c0bedd76a06a,1a9e4947-acc4-4994-9d1f-c2d1a7515833,Tin mới, http://news.zing.vn/RSS/new.rss,1,1
        eadee3bc-0811-452f-a221-b6b289de87b5,4bf0a456-71b1-4bf2-9eea-1ffb65b4abbc,Tin hot,  http://feeds.feedburner.com/TinHot-Linkhay,1,1
        204888a8-e53d-4e91-98ff-25325ea552fb,4bf0a456-71b1-4bf2-9eea-1ffb65b4abbc,Tin mới,  http://feeds.feedburner.com/TinMoi-Linkhay,1,1
        be5123c0-68ea-47af-be74-daf5f7638cb8,9e31b411-d24c-40c5-b16f-23acff1c524b,Trang chủ, http://feeds.feedburner.com/wttvn, 1,1
        7bbb39d1-49e3-4078-be50-695449a82340,7c13fa56-c25e-42b5-8887-03c59dfacd0e,Tin mới nhất, http://nld.com.vn/rss/tin-moi-nhat, 1,1
        681c25eb-b614-4b4e-8197-d79df14b0597,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Thời sự trong nước, http://nld.com.vn/rss/thoi-su-trong-nuoc, 1, 1
        493dc72b-5320-4457-b58b-7fc4255060a3,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Thời sự quốc tế, http://nld.com.vn/rss/thoi-su-quoc-te, 1, 1
        e75f5d05-f00d-4db7-9ad5-1f0389d96c02,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Kinh tế, http://nld.com.vn/rss/kinh-te, 1, 1
        a9a2615a-f08a-4da1-a929-88598b6008ad,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Công đoàn, http://nld.com.vn/rss/cong-doan, 1, 0
        70ee412d-bd02-4081-b08b-242c4d4eafa9,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Giáo dục Khoa học, http://nld.com.vn/rss/giao-duc-khoa-hoc, 1, 0
        cd767a30-141c-4afc-867c-e6251efd1725,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Hội nhập & phát triển, http://nld.com.vn/rss/hoi-nhap-phat-trien, 1, 0
        55419894-cd22-42b9-acd2-10b24433959f,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Pháp luật, http://nld.com.vn/rss/phap-luat, 1, 0
        7792d26c-3857-47bf-920c-0e58f8f74dc6,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Văn hóa Văn nghệ, http://nld.com.vn/rss/van-hoa-van-nghe, 1, 1
        efb3dae7-ace1-4f02-ae38-f891f1abdde9,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Thể thao, http://nld.com.vn/rss/the-thao, 1, 1
        b9bbca0a-6a8a-4a8f-b790-ab7624f3937a,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Sức khỏe, http://nld.com.vn/rss/suc-khoe, 1, 0
        27a5b555-2afa-4524-b60d-707ad6ac53c8,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Tình yêu Hôn nhân, http://nld.com.vn/rss/tinh-yeu-hon-nhan, 1, 1
        7cc46813-5151-4bbf-8a36-12308bc9c36e,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Bạn đọc, http://nld.com.vn/rss/ban-doc, 1, 0
        e11bc5ac-0a76-4f33-9706-170fe00dbba7,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Sức khỏe & Dinh dưỡng, http://nld.com.vn/rss/suc-khoe-dinh-duong, 1, 0
        c19c977d-7e2a-4bdd-a02a-955a71515ca7,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Khoa học, http://nld.com.vn/rss/khoa-hoc, 1, 1
        19fb000c-e03f-4fb2-863e-fd9863b56ac8,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Truyền hình, http://nld.com.vn/rss/truyen-hinh, 1, 0
        a288f05d-a58e-4efa-b837-974e97530c39,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Địa phương, http://nld.com.vn/rss/dia-phuong, 1, 0
        ae147e46-c00b-402b-a792-6cc3f52b24fe,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Mai vàng, http://nld.com.vn/rss/mai-vang, 1, 0
        6e56167c-5f6f-4eec-b480-056513f4302c,7c13fa56-c25e-42b5-8887-03c59dfacd0e, VnMoney, http://nld.com.vn/rss/vnmoney, 1, 0
        f2eeae2e-bc41-48de-939e-46d449d48ef3,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Diễn đàn, http://nld.com.vn/rss/dien-dan, 1, 0
        af399800-6857-4a61-9212-f387c89737b7,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Thi ảnh, http://nld.com.vn/rss/thi-anh, 1, 0
        ab0930f2-abf9-4fa7-ad38-893b2aa1498f,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Du lịch NLĐ, http://nld.com.vn/rss/du-lich, 1, 0
        8bbd4b1f-b0d4-4b13-8e61-353323ca8a3a,7c13fa56-c25e-42b5-8887-03c59dfacd0e, Tuyển sinh NLĐ, http://nld.com.vn/rss/tuyen-sinh-nld, 1, 0
        bf3c9a97-2fdf-4cd7-b437-a0af2fd195ee,7c13fa56-c25e-42b5-8887-03c59dfacd0e, World Cup 2014, http://nld.com.vn/rss/world-cup-2014, 1, 0
        30b6badd-2347-4868-a6ba-7dc079644d46, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Chính trị, http://vov.vn/rss/chinh-tri-209.rss,1,1
        d6149f4a-69d5-4f11-8b47-dce820749fed, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Đời sống,http://vov.vn/rss/doi-song-218.rss,1,0
        74d1db60-5b58-48e1-b5f7-350743d3e327, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Thế giới,http://vov.vn/rss/thegioi-213.rss,1,1
        6e00dc47-c13c-4a77-8135-2d35daa6a015, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Kinh tế,http://vov.vn/rss/kinh-te-212.rss,1,0
        982fb67c-475b-46ce-87c6-7c2f6a299b5b, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Xã hội,http://vov.vn/rss/xa-hoi-314.rss,1,1
        f577b05a-32ef-451b-a5da-f2ca2e6490ff, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Pháp luật, http://vov.vn/rss/phap-luat-237.rss,1,0
        11e6c464-71fe-46d7-913d-60e64ad8c194, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Thể thao, http://vov.vn/rss/the-thao-214.rss,1,1
        2f6aecc7-27a3-469c-bf68-497182708036, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Văn hóa, http://vov.vn/rss/van-hoa-215.rss,1,1
        fd6bb040-8674-49fc-9e5d-53db5b54ef91, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Người Việt, http://vov.vn/rss/nguoi-viet-287.rss,1,0
        40c17e5b-aa08-46cc-b165-6d32f7e32d47, 662d0f68-d2ff-4880-82dc-bb47fb1654de,Sức khỏe, http://vov.vn/rss/suc-khoe-311.rss,1,0
        5971a95b-eded-4985-97b7-5ae5e33221a0, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Blog,http://vov.vn/rss/blog-394.rss,1,0
        f5880c43-16c1-4e04-9072-bba3e384e27f, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Games, http://vov.vn/rss/games-417.rss,1,0
        a4294857-2622-447a-89d5-6ded470db936, 662d0f68-d2ff-4880-82dc-bb47fb1654de, Ô tô - Xe máy, http://vov.vn/rss/oto-xe-may-423.rss,1,0
        a43c1c9a-1c4d-40e0-8e39-2524dde773e7, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Thời sự - Chính trị,http://www.cand.com.vn/vi-VN/thoisu.rss, 1, 1
        9187c86f-ec88-461e-8050-008fc2d50b42, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Xã hội, http://www.cand.com.vn/vi-VN/xahoi.rss, 1, 1
        e373d564-56c6-4f25-b9c0-0771d06a7b51, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Công an trong lòng dân,http://www.cand.com.vn/vi-VN/trongmatdan.rss, 1, 0
        b8a69bd1-c3ef-47b0-b4b6-4b25fd5aecb1, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Nhịp cầu nhân ái, http://www.cand.com.vn/vi-VN/nhanai.rss, 1, 0
        9faa3014-ee38-4701-b363-a90177881557, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Tội phạm A-Z,http://www.cand.com.vn/vi-VN/toiphama-z.rss, 1, 1
        f78ca4ee-a408-49dc-9e95-b519241ca0fa, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Pháp luật - Bạn đọc, http://www.cand.com.vn/vi-VN/bandoc.rss, 1, 0
        cf8c33bb-5dc5-4d2d-82d3-aeac139bc160, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Văn hóa - Thể thao,http://www.cand.com.vn/vi-VN/vanhoa.rss, 1, 1
        15029806-90f5-4642-a5d0-06f2c4bac740, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Kinh tế,http://www.cand.com.vn/vi-VN/kinhte.rss, 1, 0
        326d35f9-ddb5-44d8-9742-72e703ec8b68, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Quốc tế,http://www.cand.com.vn/vi-VN/quocte.rss, 1, 1
        8ade8e11-e1a3-49b8-8f60-3922ebbbaeed, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Khoa học - Công nghệ,http://www.cand.com.vn/vi-VN/khcn.rss, 1, 0
        09920545-3828-42fd-8618-75f9fb8cb7d0, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Thế giới phương tiện, http://www.cand.com.vn/vi-VN/tgptien.rss, 1, 0
        36fcf361-e4db-4522-8741-ce3cb2fdc466, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, World Cup 2014,http://www.cand.com.vn/vi-VN/thethao.rss, 1, 0
        8eb516b8-b228-44bb-b73d-b6c2b74602d6, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Phóng sự - Tư liệu,http://www.cand.com.vn/vi-VN/phongsu.rss, 1, 0
        66597bef-b385-45cc-b3d0-fa07e6f43bd4, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Sự kiện - Bình luận, http://www.cand.com.vn/vi-VN/binhluan.rss, 1, 0
        7e815207-7b61-406f-86ea-df33705c89fd, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Ý kiến bạn đọc, http://www.cand.com.vn/vi-VN/ykienbandoc.rss, 1, 0
        b658f163-e0e6-4eb3-a0f4-ce6e61471d08, 23896354-7b7f-4ab4-af21-1bbfe2f4f82f, Giao lưu trực tuyến, http://www.cand.com.vn/vi-VN/giaoluutt.rss, 1, 0
        9b9e513c-73d8-4958-8e6a-0d070f5b3ea7, fcbc7304-612f-477c-af10-554d46abdffa, Trang chủ, http://www.qdnd.vn/qdndsite/rss.aspx?cul=vi-vn, 1, 1
        81fc4359-e1ab-43d8-80fa-2538d17c4247, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Xã hội,  http://www.tienphong.vn/rss/xa-hoi-2.rss, 1, 1
        492e8969-891f-48f6-a99d-70b14f13234d, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Tin tức, http://www.tienphong.vn/rss/xa-hoi-tin-tuc-104.rss, 1, 1
        bb61e330-5786-4c71-8c76-84e3a422ecdb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Trà nóng - Trà đá, http://www.tienphong.vn/rss/xa-hoi-tra-nong-tra-da-114.rss,1 , 0
        8fc3b6bb-25e3-49f5-889a-4142a1ff6d42, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Chuyện hôm nay, http://www.tienphong.vn/rss/xa-hoi-chuyen-hom-nay-18.rss,1 , 0
        620f01ba-a4cc-4448-b128-ab27c604956e, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Phóng sự, http://www.tienphong.vn/rss/xa-hoi-phong-su-13.rss,1 , 0
        df759752-bbe3-46ee-b5a9-7b15b9c3406f, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Kinh tế, http://www.tienphong.vn/rss/kinh-te-3.rss,1 , 1
        3b573557-30ca-4a14-be66-044a4763d537, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Thị trường, http://www.tienphong.vn/rss/kinh-te-thi-truong-24.rss,1 , 0
        f3223853-4a5a-4050-a444-34bbd60460fb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Doanh nghiệp, http://www.tienphong.vn/rss/kinh-te-doanh-nghiep-22.rss,1 , 0
        a9cbbd6a-3e7d-406e-98c2-910072a66154, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Doanh nhân, http://www.tienphong.vn/rss/kinh-te-doanh-nhan-165.rss,1 , 0
        4591f88c-d15a-40cc-8f37-fb428a5ddc89, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Chứng khoán, http://www.tienphong.vn/rss/kinh-te-chung-khoan-105.rss,1 , 0
        caa8d4f7-fa62-4c39-9922-fe6093033445, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Địa ốc, http://www.tienphong.vn/rss/dia-oc-166.rss,1 , 0
        d5e87688-999a-49d8-bba6-551e56a373ed, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Thế giới, http://www.tienphong.vn/rss/the-gioi-5.rss,1 , 1
        68353934-0241-4d59-85ea-9f704c6e3b4e, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Phân tích - Bình luận, http://www.tienphong.vn/rss/the-gioi-phan-tich-binh-luan-31.rss,1 , 0
        a9f2480a-1094-4051-821e-4505b627f378, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Người Việt năm châu, http://www.tienphong.vn/rss/the-gioi-nguoi-viet-nam-chau-183.rss,1 , 0
        d7e6c748-09ba-4a36-9bc4-a60af56943f1, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Chuyện lạ, http://www.tienphong.vn/rss/chuyen-la-32.rss,1 , 0
        447a22f0-de40-4a3c-a147-c24f237d8b73, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Giới trẻ, http://www.tienphong.vn/rss/gioi-tre-4.rss,1 , 1
        05781b24-d82f-40e0-a90b-39c241c633fe, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Nhịp sống, http://www.tienphong.vn/rss/gioi-tre-nhip-song-27.rss,1 , 0
        36f78a1b-a94c-4e6b-bebc-024d27caf566, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Việc làm, http://www.tienphong.vn/rss/gioi-tre-viec-lam-102.rss,1 , 0
        4bee9d79-3784-4b41-83ad-8dfaae4d122c, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Đoàn và tuổi trẻ, http://www.tienphong.vn/rss/gioi-tre-doan-tuoi-tre-25.rss,1 , 0
        8a0797c9-7dcc-478d-adff-d047f8bab568, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Pháp luật, http://www.tienphong.vn/rss/phap-luat-12.rss,1 , 0
        40811e04-7b69-49a2-a580-3885dc499bdb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Bản tin 113, http://www.tienphong.vn/rss/ban-tin-113-231.rss,1 , 0
        fa008cc0-dfe4-4264-a60b-3f0493df8593, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Pháp đình, http://www.tienphong.vn/rss/phap-luat-chuyen-toa-173.rss,1 , 0
        31057d8e-fdea-4044-86d0-38b9f3eaa6e5, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Thể thao, http://www.tienphong.vn/rss/the-thao-11.rss,1 , 1
        c5a9fed5-d090-4dca-91f7-479076426048, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Bóng đá, http://www.tienphong.vn/rss/the-thao-bong-da-49.rss,1 , 1
        1ae0bc86-9bab-4d28-8ac2-6346dc35c233, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Hậu trường thể thao, http://www.tienphong.vn/rss/the-thao-hau-truong-111.rss,1 , 1
        488b35bf-91e8-4139-8eae-c17c534ff216, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, World Cup, http://www.tienphong.vn/rss/world-cup-23.rss,1 , 0
        57b4f0e6-507d-47ba-ad88-915b154bb8bb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Văn nghệ, http://www.tienphong.vn/rss/van-nghe-7.rss,1 , 0
        1fb81110-5fb1-41ae-a28d-23f93229f10a, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Giải trí, http://www.tienphong.vn/rss/giai-tri-36.rss,1 , 1
        e3c5cbcc-2db0-4c7e-8380-94015918ef25, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Sao, http://www.tienphong.vn/rss/giai-tri-sao-35.rss,1 , 1
        bb046cd6-66ec-44d2-91d0-666cffcc7e0e, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Hậu trường, http://www.tienphong.vn/rss/giai-tri-hau-truong-168.rss,1 , 1
        4f30a1fd-ced0-4b8c-a5f8-04c80d112851, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Giáo dục, http://www.tienphong.vn/rss/giao-duc-71.rss,1 , 0
        df652d09-1cb0-44ed-b775-b7aaf4e182ba, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Tuyển sinh, http://www.tienphong.vn/rss/tuyen-sinh2011-163.rss,1 , 0
        cf2c0cf3-41df-420e-9810-2c36aa40522c, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Du học, http://www.tienphong.vn/rss/giao-duc-du-hoc-40.rss,1 , 0
        4a639ce3-7219-4bcc-9395-b8a916e78884, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Khoa học, http://www.tienphong.vn/rss/cong-nghe-45.rss,1 , 0
        6418c139-6e42-4a7b-98b5-51eeb6561cdb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Công nghệ, http://www.tienphong.vn/rss/cong-nghe-khoa-hoc-46.rss,1 , 1
        50e52fc7-67e2-4bb1-96f0-240ceae197eb, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Vi tính, http://www.tienphong.vn/rss/cong-nghe-vi-tinh-170.rss,1 , 0
        fbc16f82-6fdb-4f1c-8339-78fcd5f5ed6b, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Điện thoại, http://www.tienphong.vn/rss/cong-nghe-dien-thoai-171.rss,1 , 0
        aa2a53ca-9e49-413e-901e-777e70cf2ffa, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Xe, http://www.tienphong.vn/rss/xe-113.rss,1 , 0
        03eed8e6-0301-4ce7-92ba-46dcbbad08a3, 89a81534-4b8f-45aa-bb1a-4aab68a86f8d, Người lính, http://www.tienphong.vn/rss/hanh-trang-nguoi-linh-182.rss,1 , 0
        3ffb9ef7-30a3-4a5e-b0cc-662bd514d23a, 3ffb9ef7-30a3-4a5e-b0cc-662bd514d23a, Trang chủ, http://vtc.vn/RssCate.aspx, 1, 1
        d7ca36e4-2c6a-44f7-9007-5e3fb8e89378, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Thời sự Chính trị, http://daidoanket.vn/rss.aspx?Menu=1366, 1, 1
        dfaf85a0-06e6-4eef-9d71-93f8e126c59e, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Thời luận, http://daidoanket.vn/rss.aspx?Menu=1427, 1, 1
        f03b169c-c482-4732-a3c7-1ce9b3e0f3d0, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Kinh tế Xã hội, http://daidoanket.vn/rss.aspx?Menu=1372, 1, 1
        cc7f8db6-cd46-4bf8-be2e-80827d77aca1, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Thể thao, http://daidoanket.vn/rss.aspx?Menu=1424, 1, 1
        5ee055cd-0035-4bc8-a335-1fac48d81b88, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Văn hóa Nghệ thuật, http://daidoanket.vn/rss.aspx?Menu=1420, 1, 1
        ae9af511-ac4e-4eaa-aba0-7bde500d78d9, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Giám sát Pháp luật, http://daidoanket.vn/rss.aspx?Menu=1390, 1, 0
        55a4246c-f10e-412b-ac9e-cf2b489c099c, dbf1ab11-8b32-45f5-bf9b-5b037cb587e3, Quốc tế, http://daidoanket.vn/rss.aspx?Menu=1454, 1, 1
        a93cc793-2b76-48d6-940e-6fc2b98e098a, f81f4939-d773-45ea-bac6-32f20c042b09, Chính trị, http://hanoimoi.com.vn/Danh-muc-rss/192/Chinh-tri.rss,1,1
        86cbd757-cd07-47fc-a6f7-58f079fc2338, f81f4939-d773-45ea-bac6-32f20c042b09, Xã hội, http://hanoimoi.com.vn/Danh-muc-rss/163/Xa-hoi.rss,1,1
        47caa764-ad24-4685-9855-66cf3de3c2d5, f81f4939-d773-45ea-bac6-32f20c042b09, Kinh tế, http://hanoimoi.com.vn/Danh-muc-rss/190/Kinh-te.rss,1,1
        7f429f3f-8eb5-4cd2-84a4-5013e23c61d4, f81f4939-d773-45ea-bac6-32f20c042b09, Thế giới, http://hanoimoi.com.vn/Danh-muc-tin/189/The-gioi.rss,1,1
        f6a31cec-16e1-428d-87ce-157e5517710c, f81f4939-d773-45ea-bac6-32f20c042b09, Văn hóa, http://hanoimoi.com.vn/Danh-muc-rss/179/Van-hoa/,1,1
        97c5ffcf-9097-4cf1-bedc-fcb785c8baab, f81f4939-d773-45ea-bac6-32f20c042b09, Thể thao, http://hanoimoi.com.vn/Danh-muc-rss/170/The-thao/,1,1
        bf4a3a06-0755-4201-9a61-84bdb7d1bcef, f81f4939-d773-45ea-bac6-32f20c042b09, Giáo dục, http://hanoimoi.com.vn/Danh-muc-rss/164/Giao-duc.rss,1,0
        91b073eb-a103-4e9f-a443-a80dcb57abb8, f81f4939-d773-45ea-bac6-32f20c042b09, Pháp luật, http://hanoimoi.com.vn/Danh-muc-rss/175/Phap-luat.rss,1,0
        49f95fad-aa79-400d-9cf7-259d08cae6a4, f81f4939-d773-45ea-bac6-32f20c042b09, Khoa học, http://hanoimoi.com.vn/Danh-muc-rss/100/Khoa-hoc.rss,1,0
        9fd3c37c-2d3a-4488-ba86-1ee9a7d09f24, f81f4939-d773-45ea-bac6-32f20c042b09, Đời sống, http://hanoimoi.com.vn/Danh-muc-rss/224/Doi-song.rss,1,1
        820bc97c-7d03-475a-93f8-76a8d6012c1f, f81f4939-d773-45ea-bac6-32f20c042b09, Phóng sự, http://hanoimoi.com.vn/Danh-muc-rss/228/Phong-su-Ky-su.rss,1,0
        d1b26d42-fbf5-4368-9f35-a9bf09838ada, f81f4939-d773-45ea-bac6-32f20c042b09, Ôtô Xe máy, http://hanoimoi.com.vn/Danh-muc-rss/601/Oto-xemay.rss,1,0
        5a15151c-83db-4456-84e5-984d071bc790, f81f4939-d773-45ea-bac6-32f20c042b09, Thăng Long Hà Nội, http://hanoimoi.com.vn/Danh-muc-rss/204/1000_nam_thang_long.rss,1,0
        ca84efd1-65e9-40d4-8c59-1266ff92cf59, 2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Việt Báo Trang Nhất ,http://vietbao.vn/rss2/trang-nhat.rss,1,1
        02ed67d2-41ff-46ed-975d-da2b3dfdb01e, 2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Tin Mới Nhất trên Việt Báo ,http://vietbao.vn/rss2/tinmoi.rss,1,1
        64e71c32-e1ee-4e7c-a076-c5968c52b86a, 2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, An Ninh - Pháp Luật ,http://vietbao.vn/live/An-ninh-Phap-luat/rss.xml,1,0
        7dd6a426-0b92-47ef-ab8d-5bbdc80e1e69 ,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Blog Hay ,http://vietbao.vn/live/Blog/rss.xml,1,1
        ffa2a63b-b566-4914-9e37-13f50237772b,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Bóng Đá ,http://vietbao.vn/live/Bong-da/rss.xml,1,1
        15fa6733-a5c5-4c6f-8085-a3955e5c46e4,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Chiêm Tinh ,http://vietbao.vn/live/Chiem-tinh/rss.xml,1,0
        5a13cc50-f070-4546-8fd5-9075b23f7dec,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Công Nghệ ,http://vietbao.vn/live/Cong-nghe/rss.xml,1,1
        f9896f1c-aa48-489d-8b3d-bf0a53e9f551,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Du Lịch ,http://vietbao.vn/live/Du-lich/rss.xml,1,1
        a57354b2-8d5a-4c38-b19a-902b582a5864,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Đời Sống-Gia Đình ,http://vietbao.vn/live/Doi-song-Gia-dinh/rss.xml,1,1
        ab23d9e7-a5ec-4503-a2ea-20a159f3ba26,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Game ,http://vietbao.vn/live/Game/rss.xml,1,0
        d67e80b9-b0de-4559-a173-17a84a4a32c8,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Giải Trí ,http://vietbao.vn/live/The-gioi-giai-tri/rss.xml,1,1
        e105bae5-0c6d-48b6-8758-33b0cfeeb1c6,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Giáo Dục ,http://vietbao.vn/live/Giao-duc/rss.xml,1,0
        dad2aae3-8533-4994-9053-17e14937549c,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Khám Phá Việt Nam ,http://vietbao.vn/live/Kham-pha-Viet-Nam/rss.xml,1,0
        4b0588bf-f458-4440-8122-b3491c9b99d0,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Khoa Học ,http://vietbao.vn/live/Khoa-hoc/rss.xml,1,1
        e5849976-cf3b-4067-a9a4-b0476f440065,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Kinh Tế ,http://vietbao.vn/live/Kinh-te/rss.xml,1,1
        d83e324a-4e80-433b-a73c-da8e3647f429,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Người Việt Bốn Phương ,http://vietbao.vn/live/Nguoi-Viet-bon-phuong/rss.xml,1,0
        404adfe1-4438-41e9-878e-671a9144eb0e,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Nhà Đất ,http://vietbao.vn/live/Nha-dat/rss.xml,1,0
        454d5cde-b87a-49d0-bc59-1aa70256d21a,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Ô tô - Xe Máy ,http://vietbao.vn/live/O-to-xe-may/rss.xml,1,0
        623769a2-88c0-4d90-a85a-80fbafde2a59,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Phóng Sự ,http://vietbao.vn/live/Phong-su/rss.xml,1,0
        69d289e2-35d6-48df-8542-766af6c3164b,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Sống Đẹp ,http://vietbao.vn/live/Dep/rss.xml,1,1
        db988c15-40ed-4c76-8351-6d767106234c,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Sức Khỏe ,http://vietbao.vn/live/Suc-khoe/rss.xml,1,1
        e9316955-fc64-4530-8691-0a21565f0488,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Tết ,http://vietbao.vn/live/Tet/rss.xml,1,0
        b93a4e08-609d-4d6f-8232-f526a87774d3,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Thế Giới ,http://vietbao.vn/live/The-gioi/rss.xml,1,1
        70644353-dc32-4ad5-8c2e-e60ad8c9dafc,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Thế Giới Giải Trí ,http://vietbao.vn/live/The-gioi-giai-tri/rss.xml,1,1
        716880b3-76bb-428d-ad60-b1e1df3afcb1,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Thế Giới Trẻ ,http://vietbao.vn/live/The-gioi-tre/rss.xml,1,1
        1f090ed6-0cde-4fdc-b3b9-0dd929de27e7,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Thể Thao ,http://vietbao.vn/live/The-thao/rss.xml,1,1
        d63a962b-e479-4606-83e6-f89d7c13a7fe,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Trang Ban Đọc ,http://vietbao.vn/live/Trang-ban-doc/rss.xml,1,0
        f70eff7a-34ed-4da9-8184-5b7fba5f6505,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Tuyển Sinh ,http://vietbao.vn/live/Tuyen-sinh/rss.xml,1,0
        e791d297-b978-420b-9b86-0b247f707e5b,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Văn Hóa ,http://vietbao.vn/live/Van-hoa/rss.xml,1,1
        37efeb8d-1449-4c66-a48c-54d1045bc002,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Việc Làm ,http://vietbao.vn/live/Viec-lam/rss.xml,1,0
        9e8f5c32-fc18-48f6-9d5f-c1bb3f230093,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Vui Cười ,http://vietbao.vn/live/Cuoi/rss.xml,1,0
        b325ad2b-bada-406e-86ed-10a772838063,2ced4ee9-94f7-4a3d-adc9-e9caf6b47739, Xã Hội ,http://vietbao.vn/live/Xa-hoi/rss.xml,1,1
        7938f337-365a-4f91-bd90-8866e98b2f5e, 2992a5db-fe37-4c24-8d19-53a41158b34c, Công nghệ, http://vnmedia.vn/rss/?Catid=30, 1, 1
        61298623-5c50-45f5-9577-21f8bf87af75, 2992a5db-fe37-4c24-8d19-53a41158b34c, Xã hội, http://vnmedia.vn/rss/?Catid=4, 1, 1
        4f31f720-c345-4977-989f-aff3961c8a75, 2992a5db-fe37-4c24-8d19-53a41158b34c, Quốc tế, http://vnmedia.vn/rss/?Catid=5, 1, 1
        889ff8cc-618e-4ded-ac9d-3600769f8c03, 2992a5db-fe37-4c24-8d19-53a41158b34c, Đối thoại, http://vnmedia.vn/rss/?Catid=438, 1, 0
        7ba375f2-0a98-4394-b7d6-f5e00326d067, 2992a5db-fe37-4c24-8d19-53a41158b34c, Kinh tế, http://vnmedia.vn/rss/?Catid=3, 1, 1
        1d36506f-304a-4b69-93cd-236d2fcfb62b,2992a5db-fe37-4c24-8d19-53a41158b34c, Pháp luật, http://vnmedia.vn/rss/?Catid=373, 1, 0
        b16f35e2-446a-4cc2-af68-9be28db90be3,2992a5db-fe37-4c24-8d19-53a41158b34c, Văn hóa, http://vnmedia.vn/rss/?Catid=28, 1, 1
        51491d8a-f892-4c32-b473-1852f5d0e3d2,2992a5db-fe37-4c24-8d19-53a41158b34c, Thể thao, http://vnmedia.vn/rss/?Catid=27, 1, 1
        00260e1a-6a17-4549-8d0b-9480322dbf4c,2992a5db-fe37-4c24-8d19-53a41158b34c, Sức khỏe, http://vnmedia.vn/rss/?Catid=72, 1, 0
        f3bed2ac-3f3b-406a-b5dd-5e3da302d8c6,2992a5db-fe37-4c24-8d19-53a41158b34c, Ô tô Xe máy, http://vnmedia.vn/rss/?Catid=350, 1, 0
        5759561e-e3ba-4c0c-b391-e8df88c26dae,2992a5db-fe37-4c24-8d19-53a41158b34c, Bất động sản, http://vnmedia.vn/rss/?Catid=96, 1, 0
        5e301613-47b4-42e6-a983-79fdb329a884,2992a5db-fe37-4c24-8d19-53a41158b34c, Thông tin Cuộc sống, http://vnmedia.vn/rss/?Catid=390, 1, 0
        348ae5ed-42b8-42b6-b8f1-f0ad2b14f21a,2992a5db-fe37-4c24-8d19-53a41158b34c, Nghĩa tình, http://vnmedia.vn/rss/?Catid=385, 1, 0
        b96a8cd3-766f-489c-a7ff-2886c574b8bd, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Tin tức, http://quachdaica.info/news/rss/, 1, 1
        1d023a85-d797-46ed-87ba-fdcb8feaab76, 7d4df4df-0b29-409e-bb7d-05c107bcc292, 8x 9x, http://quachdaica.info/news/rss/8x-9x-world/ ,1,0
        1973491e-035a-47d7-be83-837197af09d4, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Thời sự, http://quachdaica.info/news/rss/thoi-su-xa-hoi/ ,1,1
        f4e50c9a-eeba-4473-b26c-c8eebb224ab1, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Thế giới, http://quachdaica.info/news/rss/the-gioi/ ,1,1
        32681c52-10aa-4be3-96c5-c6f7dfc61a3b, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Thể thao SopCast, http://quachdaica.info/news/rss/the-thao-sopcast/,1,1
        f1c189be-49f3-4d1e-9169-39f33430f152, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Giải trí, http://quachdaica.info/news/rss/giai-tri/,1,1
        d12cf4a7-bd82-48e0-a6df-ecbc99ca04c1, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Phóng sự, http://quachdaica.info/news/rss/phong-su/,1,1
        a1da2cd2-5595-476d-9da3-c507def8e251, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Showbiz, http://quachdaica.info/news/rss/showbiz-scandal/,1,1
        8179d8dc-6692-482d-aa1a-f6a688794f16, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Khám phá, http://quachdaica.info/news/rss/kham-pha/,1,0
        ad400044-c6f8-4c3f-a1cc-8b5295dfd1a6, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Sao Việt, http://quachdaica.info/news/rss/sao-viet/,1,1
        4237cb45-9e35-4428-94b3-22aaf81041b1, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Sao Ngoại, http://quachdaica.info/news/rss/sao-ngoai/,1,1
        d9ae4f22-1a59-4399-b573-ecce04b4727f, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Số Hóa, http://quachdaica.info/news/rss/so-hoa/,1,1
        d0eaeefa-7398-473f-96bc-9c57607318be, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Trắc nghiệm, http://quachdaica.info/news/rss/trac-nghiem/,1,0
        3bf44495-7ad5-46ab-bba8-aa43ca1070e0, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Horoscope, http://quachdaica.info/news/rss/horoscope/,1,0
        e9739236-447e-4a51-a6cb-2ccb6269c8d1, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Chuyện ấy, http://quachdaica.info/news/rss/thi-tham-chuyen-ay/,1,1
        e0843a05-4b3d-4229-a823-9b9526a36f21, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Bưởi bự, http://quachdaica.info/news/rss/Buoi-bu/,1,1
        7cffa1b9-dcf0-4db3-af2c-44509c97cd62, 7d4df4df-0b29-409e-bb7d-05c107bcc292, Shock Lạ, http://quachdaica.info/news/rss/shock-doc-la/,1,1
        7b08bc7a-92f6-459f-bf58-4193d056cf53, f59e0e67-c2b9-490f-95b6-f763c61e445f, Trang chủ, http://soha.vn/rss.htm,1,1
        fd6a208d-528a-4ac8-bd65-ed8f96a13ee3, f59e0e67-c2b9-490f-95b6-f763c61e445f, Giải trí, http://soha.vn/giai-tri.rss,1,1
        f36a4836-52b0-41a3-a469-d78cbdb19ae6, f59e0e67-c2b9-490f-95b6-f763c61e445f, Thể thao, http://soha.vn/the-thao.rss,1,1
        ed709a9e-448c-46ce-83b2-aa42102be482, f59e0e67-c2b9-490f-95b6-f763c61e445f, Xã hội, http://soha.vn/xa-hoi.rss,1,1
        9936a596-7cc6-4710-9bf3-2500dc12b1eb, f59e0e67-c2b9-490f-95b6-f763c61e445f, Pháp luật, http://soha.vn/phap-luat.rss,1,0
        615ab37a-3492-41d9-98f4-21e49911aaeb, f59e0e67-c2b9-490f-95b6-f763c61e445f, Kinh doanh, http://soha.vn/kinh-doanh.rss,1,0
        cf0de3d7-6d9c-4a4b-b800-fb1e6ae53e9d, f59e0e67-c2b9-490f-95b6-f763c61e445f, Công nghệ, http://soha.vn/cong-nghe.rss,1,1
        5c88ce6a-3ac0-4236-a45b-b99a89337df9, f59e0e67-c2b9-490f-95b6-f763c61e445f, Quốc tế, http://soha.vn/quoc-te.rss,1,1
        de749cc9-84a3-451a-b56c-1552317cced0, f59e0e67-c2b9-490f-95b6-f763c61e445f, Sống khỏe, http://soha.vn/song-khoe.rss,1,1
        a403a5ea-f4ed-42e4-ac51-b05c1251445d, f59e0e67-c2b9-490f-95b6-f763c61e445f, Quân sự, http://soha.vn/quan-su.rss,1,0
        3508f771-376f-498b-81e0-b21bafd35a1f, f59e0e67-c2b9-490f-95b6-f763c61e445f, Cư dân mạng, http://soha.vn/cu-dan-mang.rss,1,1
        68fd415b-4b01-487c-9753-7441bf213bbc, f59e0e67-c2b9-490f-95b6-f763c61e445f, Thế giới đó đây, http://soha.vn/the-gioi-do-day.rss,1,0
        1def0fd4-8117-4bb5-a3f5-62f22d931d64, f59e0e67-c2b9-490f-95b6-f763c61e445f, Tư vấn pháp luật, http://soha.vn/tu-van-phap-luat.rss,1,0
        143bc07e-2cac-464f-99db-1e9eb26c3eba, f59e0e67-c2b9-490f-95b6-f763c61e445f, World cup 2014, http://soha.vn/world-cup-2014.rss,1,0

    }
}
