// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$60 {

    static final FunctionDescriptor JPC_Shape_GetSubShapeTransformedShape$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("shape_position_com"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("shape_rotation"),
        Constants$root.C_POINTER$LAYOUT.withName("shape"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("shape_scale"),
        Constants$root.C_INT$LAYOUT.withName("body_id"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("id"),
            Constants$root.C_INT$LAYOUT.withName("current_bit")
        ).withName("sub_shape_id_creator")
    ).withName("JPC_TransformedShape"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubShapeTransformedShape$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubShapeTransformedShape",
        constants$60.JPC_Shape_GetSubShapeTransformedShape$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubmergedVolume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubmergedVolume$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubmergedVolume",
        constants$60.JPC_Shape_GetSubmergedVolume$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetCastRay$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetCastRay$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetCastRay",
        constants$60.JPC_Shape_GetCastRay$FUNC
    );
    static final FunctionDescriptor JPC_Shape_CollectCastRay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_CollectCastRay$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_CollectCastRay",
        constants$60.JPC_Shape_CollectCastRay$FUNC
    );
    static final FunctionDescriptor JPC_Shape_CollidePoint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_CollidePoint$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_CollidePoint",
        constants$60.JPC_Shape_CollidePoint$FUNC
    );
    static final FunctionDescriptor JPC_Shape_CollectTransformedShapes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_CollectTransformedShapes$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_CollectTransformedShapes",
        constants$60.JPC_Shape_CollectTransformedShapes$FUNC
    );
}


