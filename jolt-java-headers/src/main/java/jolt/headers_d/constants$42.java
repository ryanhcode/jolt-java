// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor JPC_HeightFieldShapeSettings_GetBitsPerSample$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HeightFieldShapeSettings_GetBitsPerSample$MH = RuntimeHelper.downcallHandle(
        "JPC_HeightFieldShapeSettings_GetBitsPerSample",
        constants$42.JPC_HeightFieldShapeSettings_GetBitsPerSample$FUNC
    );
    static final FunctionDescriptor JPC_HeightFieldShapeSettings_SetBitsPerSample$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_HeightFieldShapeSettings_SetBitsPerSample$MH = RuntimeHelper.downcallHandle(
        "JPC_HeightFieldShapeSettings_SetBitsPerSample",
        constants$42.JPC_HeightFieldShapeSettings_SetBitsPerSample$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_Create",
        constants$42.JPC_MeshShapeSettings_Create$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf",
        constants$42.JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf",
        constants$42.JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_Sanitize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_Sanitize$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_Sanitize",
        constants$42.JPC_MeshShapeSettings_Sanitize$FUNC
    );
}


